/*
 * This is a somewhat wonky way of saying that Model is not really a component, but a function that, given a position
 * and rotation, returns a WebGL group with that position and rotation containing a mesh made of some geometry and a
 * material. This could be made significantly more powerful, as noted elsewhere (especially as noted in RenderContainer)
 */

import React from 'react';
import PropTypes from 'prop-types';
import {Euler, Vector3} from 'three';

const Model = ({position, rotation}) =>
    <group position={position} rotation={rotation}>
        <mesh>
            <geometryResource resourceId="modelGeometry"/>
            <materialResource resourceId="modelTexture"/>
        </mesh>
    </group>;

Model.propTypes = {
    position: PropTypes.instanceOf(Vector3).isRequired,
    rotation: PropTypes.instanceOf(Euler).isRequired
}

export default Model
