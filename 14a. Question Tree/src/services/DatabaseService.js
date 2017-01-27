class DatabaseService {
    var
    questions = {
        1: 'Is it bigger than a breadbox?',
        2: 'What color is it?',
        3: 'Is it a mouse?',
        4: 'Yay, I win!',
        5: 'Boo… I lose.',
        6: 'Is it an elephant?',
        7: 'Is it a polar bear?',
        8: 'Is it a bulldozer?'
    }
    answers = {
        1: {
            text: 'Yes',
            question: 2
        }
        ,
        2: {
            text: 'No',
            question: 3
        }
        ,
        3: {
            text: 'Yes',
            question: 4
        }
        ,
        4: {
            text: 'No',
            question: 5
        },
        5: {
            text: 'Grey',
            question: 6
        },
        6: {
            text: 'White',
            question: 7
        },
        7: {
            text: 'Yellow',
            question: 8
        }
    }
    answerGroups = {
        1: [1, 2],
        2: [5, 6, 7],
        3: [3, 4],
        6: [3, 4],
        7: [3, 4],
        8: [3, 4]
    };

    getQuestion(id) {
        if (id in this.questions) {
            return this.questions[id];
        } else {
            return undefined;
        }
    }

    getAnswers(id) {
        if (id in this.answerGroups) {
            return this.answerGroups[id];
        } else {
            return undefined;
        }
    }

    getAnswer(id) {
        if (id in this.answers) {
            return this.answers[id];
        } else {
            return undefined;
        }
    }
}

export default new DatabaseService();