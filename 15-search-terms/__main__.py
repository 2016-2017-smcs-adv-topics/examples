#!/usr/bin/env python
from SearchResult import SearchResult
from PyDictionary import PyDictionary
thesaurus = PyDictionary()

terms = [
    'red',
    'blue',
    'yellow'
]
searchResults = []
for term in terms:
    searchResults.append(SearchResult(term))

book = open('sense-and-sensibility.txt')
for line in book:
    for term in searchResults:
        if term.term in line:
            term.increment()

        for synonym in term.synonyms:
            if synonym in line:
                term.increment(synonym)

for term in searchResults:
    print('There are {} occurrences of synonyms of {} (using {} as synonyms)'.format(term.count, term.term, term.synonyms))
