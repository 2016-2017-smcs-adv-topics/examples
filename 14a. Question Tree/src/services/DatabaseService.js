class DatabaseService {
    var
    questions = {
        1: 'Is the power cord plugged securely into the back of the computer case and the power outlet?',
        2: 'Is it a working outlet?',
        3: 'Is the computer plugged into a surge protector?',
        4: 'Is your laptop charged?',
        5: 'Try plugging in your cord to the back of the computer case.',
        6: 'Get a lamp and try plugging it in to the outlet and turning it on.'
    }
    answers = {
        1: {
            text: 'Yes',
            question: 2
        },
        2: {
            text: 'No',
            question: 5
        },
        3: {
            text: 'I don\'t know',
            question: 6
        }
    }
    answerGroups = {
        1: [1, 2],
        2: [3]
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