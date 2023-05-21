#!/bin/bash
gradle --version
gradle clean build -x test
gradle bootRun
