# R3R Renderer Test

This is a quick project based on [this tutorial](https://www.sitepoint.com/building-a-game-reactjs-and-webgl/), trying to simplify the code the bare minimum necessary to get WebGL to render Blender models as a React node within a routed context.

### Important Caveats

  - This is set up to run with `react-router@^3.0`, which means that you have to install `react-router-bootstrap@rr-v3` for compatibility.
  - You will need to create a texture for your mesh in Blender so that it can be seen. There are a bunch of ways of doing this. The easiest (and most primitive) is the way that I created [suzanne-texture.jpg](public/assets/suzanne-texture.jpg), which is that I used the Texture Painting in Blender and exported the resulting image.
  - Pay attention to file extensions and names! For example, this code assumes that all of your assets are in your assets directory and that for a model `foo`, you have a `foo.json` three.js JSON file and a `foo-texture.jpg` texture file.
  - When you export your model from Blender, you need to make sure that you are exporting as type `Geometry` and that you have `Faces` and `Face Materials` enabled. (Refer to [this screenshot](./doc/blender-io_three-settings.png).)
