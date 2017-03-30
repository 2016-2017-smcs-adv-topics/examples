<?php

require_once __DIR__ . '/vendor/autoload.php';

use Battis\Educoder\Pest;
use Battis\ConfigXML;

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
        $config->toString('config/version') .
        $config->toString('/config/application-id') .
        $timestamp
);

/* initialize request parameters for easy screen printing */
$parameters = [
    'apiVersion' => $config->toString('/config/version'),
    'applicationId' => $config->toString('/config/application-id'),
    'userName' => $config->toString('/config/user'),
    'password' => $config->toSTring('/config/password'),
    'timestamp' => $timestamp,
    'hash' => $hash
];
print_r($parameters);

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
