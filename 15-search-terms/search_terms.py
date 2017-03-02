#!/usr/bin/env python
from PyDictionary import PyDictionary
thesaurus = PyDictionary()

terms = [
    'red',
    'blue',
    'yellow'
]
terms = dict((term, thesaurus.synonym(term)) for term in terms)

results = dict((term, 0) for term in terms)

book = open('sense-and-sensibility.txt')
for line in book:
    for term, synonyms in terms.iteritems():
        if term in line:
            results[term] += 1

        for synonym in synonyms:
            if synonym in line:
                results[term] +=1

for term, count in results.iteritems():
    print('There are {} occurrences of synonyms of {} (using {} as synonyms)'.format(count, term, terms[term]))
