import requests

url = 'http://roswell.stmarksschool.org/~arbitrage/api/v1/test/1'
data = {
    'field1': 'foo bar',
    'field2': 'baz'
}

print(requests.put(url, params = data).text)
