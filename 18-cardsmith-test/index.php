<?php

require_once __DIR__ . '/vendor/autoload.php';

use Battis\Educoder\Pest;
use Battis\ConfigXML;

define('API_VERSION', 'apiVersion');
define('APPLICATION_ID', 'applicationId');
define('USER_NAME', 'username');
define('PASSWORD', 'password');
define('TIMESTAMP', 'timestamp');
define('HASH', 'hash');

/**
 * return our current unix time in millis
 *
 * http://www.blogbyben.com/2007/09/currenttimemillis-in-php.html
 *
 * @return float
 */
function currentTimeMillis() {
    list($usec, $sec) = explode(" ", microtime());
    return round(((float)$usec + (float)$sec) * 1000);
}

/* initialize variables */
$config = new ConfigXML(__DIR__ . '/config.xml');
$api = new Pest($config->toString('/config/url'));
$timestamp = currentTimeMillis();
$hash = hash(
    'sha1',
    $config->toString('/config/seed') .
        $config->toString('/config/version') .
        $config->toString('/config/applicationid') .
        $timestamp
);

/* initialize request parameters for easy screen printing */
$parameters = [
    API_VERSION => $config->toString('/config/version'),
    APPLICATION_ID => $config->toString('/config/applicationid'),
    USER_NAME => $config->toString('/config/username'),
    PASSWORD => $config->toSTring('/config/password'),
    TIMESTAMP => $timestamp,
    HASH => $hash
];
echo 'Request Parameters:' . PHP_EOL;
print_r($parameters);

echo PHP_EOL . 'Response:' . PHP_EOL;
/* make API request (Pest is a convenient wrapper for making cURL) requests */
try {
    $response = $api->post(
        '/globalLoginValidate',
        $parameters
    );
    echo $response;
} catch (Exception $e) {
    echo $e->getMessage();
}
echo PHP_EOL . 'Status ' . $api->lastStatus() . PHP_EOL;
