/*
 * This is a collection of values and a function that calculate the movement of a particular model based on the
 * timestamp. Essentially, the model is moving back and forth along the Z-axis while also rotating back and forth
 * around the Z-axis. The sine function provides the periodicity based on the timestamp.
 */

import { Vector3, Euler, } from 'three';

const positionScale = 0.5;
const positionSpeed = 0.001;
const positionOffset = 0.2;

const rotationSpeed = 0.002;
const rotationScale = 0.03;

/**
 * We can manage our game state in a series of small, easy to reason about
 * functions
 **/
export default function modelMovementReducer( oldState, time ) {

    // Merge the old state with the updated properties
    return {
        ...oldState,
        modelPosition: new Vector3( 0, 0, positionScale * Math.sin( time * positionSpeed ) + positionOffset ),
        modelRotation: new Euler( 0, 0, rotationScale * Math.sin( time * rotationSpeed ) )
    };

}
