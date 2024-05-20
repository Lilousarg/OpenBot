# Exploring Reinforcement Learning for Autonomous Control: A Case Study with the OpenBot Platform

This repository concerns my Masters thesis, a work on implementing Reinforcement Learning to real hardware entirely on a smartphone, using the OpenBot educational platform. 

It is composed of my written report, and the folder OpenBot is forked from https://github.com/isl-org/OpenBot with modifications in the app using Android Studio, 
modifications of the python's script for machine learning training to include Reinforcement learning. There are also the codes provided for the work done on [Cartpole](Cartpole) and [Pong](Pong).

The code modifications on the OpenBot app was mostly done in the [logger folder](OpenBot/android/app/src/main/java/org/openbot/logging) where the [policy gradient feature](OpenBot/android/app/src/main/java/org/openbot/logging/PolicyGradientFragment.java) 
and [MyModel](OpenBot/android/app/src/main/java/org/openbot/logging/MyModel.java) can be found. The code for the preliminary attempt can be seen in the [python scripts](OpenBot/policy/openbot) 
and the [LoggerFragmentRL](OpenBot/android/app/src/main/java/org/openbot/logging/LoggerFragmentRL.java) class.

For any remarks or questions, do not hesitate to ask me at lilou.gras@gmail.com

