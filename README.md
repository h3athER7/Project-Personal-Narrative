# Unit 5 - Personal Narrative / Interest Animation

## Introduction

Images are often used to portray our personal experiences and interests. We also use image filters and effects to change or enhance the mood of an image. When combined into collages and presentations, these images tell a story about who we are and what is important to us. Your goal is to create an animation using The Theater and Scene API that consists of images of your personal experiences and/or interests. In this animation, you will incorporate data related to these experiences and/or interests that can be organized in a 2D array, and use image filters and effects to change or enhance the mood of your images.
## Requirements

Use your knowledge of object-oriented programming, two-dimensional (2D) arrays, and algorithms to create your personal narrative collage or animation:
- **Write Scene subclasses** – Create two Scene subclasses: either two core parts of your personal life, or two components of a personal interest. Each class must contain a constructor and private instance variable with data related to the scene
- **Create at least two 2D arrays** – Create at least two 2D arrays to store the data that will make up your visualization.
Implement algorithms – Implement one or more algorithms that use loops and logic that operate on the data in your 2D arrays.
- **Create a visualization** – Create an animation that conveys the story of the data by illustrating the patterns or relationships in the data.
- **Image Filters** – Utilize the image filters created in this unit (and possible new filters) that show a personal flare to the images used in your animation.
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions.

## UML Diagram

Put an image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here. Make sure your image file name is one work, otherwise it might not properly get displayed on this README.

![UML Diagram for my project](![vscode-vfs://github%2B7b2276223a312c22726566223a7b2274797065223a362c226964223a226d61696e227d7d/h3athER7/Project-Personal-Narrative/Screenshot%202026-02-18%2010.34.19%20PM.png](<Screenshot 2026-02-18 10.34.19 PM.png>))

## Video

Record a short video of your story to display here on your README. You can do this by:

- Screen record your project running on Code.org.
- Upload that recording to YouTube.
- Take a thumbnail for your image.
- Upload the thumbnail image to your repo.
- Use the following markdown

[![Thumbnail for my projet](![nameOfThumbnail.png](mq2.jpg)]
([youtube-URL-here](https://youtu.be/UsYndUqPblY?si=Eo4W2aOQsMvnyLSm))

## Story Description

In my animation for the personal narrative project, I decided to showcase some images based on my families. My dad is from New York while my mom is from the Philippines. I separated the images with two classes, one called AmericanSide, and the other FilipinoSide. I displayed images and text based on my two families flag, family pictures, and their general hobbies. After every image, there is a filter placed on it for the animation.

## Image Filter Analysis

One filter used in my animation project is the pixelate filter. The pixelate filter uses loops to go through every pixel in an image, then uses more loops to go through the parameter grid size. So, if a parameter is 10, the pixelate filter will focus on blocks of 10x10 pixels. Within the grid size, the program will average out all of the RGB values, and then make the entire grid size block the same color based on those averages. It will do that repeatedly throughout the entire image, creating a pixelated look.

My second filter used was a cancellation of red. In my filter, the program traverses through every pixel within the image. As it traverses through the image, the filter will look at every pixel and set the red values to zero, which cancels out any red color.