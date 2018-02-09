#!/bin/bash
cd $TRAVIS_BUILD_DIR/facade/target/scala-2.12/scalajs-bundler/main
python $TRAVIS_BUILD_DIR/build/weigh_in.py scalajs-react-semantic-ui-fastopt.js
python $TRAVIS_BUILD_DIR/build/weigh_in.py scalajs-react-semantic-ui-opt.js
