Introduction
============
This application based on https://github.com/jbaron/qx-parser (TypeScript declaration file generator for the Qooxdoo framework)

This application generates a Scala.js facade types for the Qooxdoo framework.

Please note that the generated delcaration file is not 100% OK and still need a few manual tweaks to compile correctly and be 
usable in your project.

If you are just interested in using the Qooxdoo within a Scala.js project, better to use the project
`qooxdoo-scalajs-example`. This project has a fully functional facade types file and also some glue so you can start right away.

You can get it from: https://github.com/glmars/qooxdoo-scalajs-example.git

Using it
=========
Simple make sure you have nodejs installed and then run it:

```
npm start
```

You will find a new `qooxdoo.scala` file in the root directory of the project. 


Building it
============
You will need TypeScript installed on your machine. Then you can build this project simply by running:

```
tsc 
```

The file named tsconfig.json is used by `tsc` to get its configuration from.


Todo
==========
