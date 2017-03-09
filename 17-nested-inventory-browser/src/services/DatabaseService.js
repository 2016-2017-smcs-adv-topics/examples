class DatabaseService {
    inventory = {
        flarbles: {
            id: 0,
            title: 'Flarbles',
            description: 'Description of Category A',
            items: [
                {
                    id: 0,
                    category: 0,
                    title: 'Foo',
                    description: 'Description of foo'
                },
                {
                    id: 1,
                    category: 0,
                    title: 'Bar',
                    description: 'Description of bar'
                },
                {
                    id: 2,
                    category: 1,
                    title: 'Baz',
                    description: 'Description of baz'
                },
                {
                    id: 3,
                    category: 0,
                    title: 'Flibbertygibbet',
                    description: 'Description of flibbertygibbet'
                }
            ]
        },
        snerdlets: {
            id: 1,
            title: 'Snerdlets',
            description: 'Description of Category B',
            items: [
                {
                    id: 0,
                    category: 0,
                    title: 'Fuzz',
                    description: 'Description of fuzz'
                },
                {
                    id: 1,
                    category: 0,
                    title: 'Wuzz',
                    description: 'Description of wuzz'
                }
            ]
        }
    };

    getFlarble(id) {
        return this.inventory.flarbles.items[id];
    }

    getFlarbles() {
        return this.inventory.flarbles.items;
    }

    getSnerdlet(id) {
        return this.inventory.snerdlets.items[id];
    }

    getSnerdlets() {
        return this.inventory.snerdlets.items;
    }
}

export default new DatabaseService();
