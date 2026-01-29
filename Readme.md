# Trunk based development branching strategy

This repository is being used for learning the Trunk based development branching strategy.
The project is a very simple Todo list application written in Java.

## About Trunk based development strategy:
This approach focuses on having only one branch:
- main branch

Everyone works on the main branch. It is always kept in a release-ready state.
To work on features, 'feature flags' are used. These are flags in the code itself, which prevents incomplete feature from being included in the release.
This strategy is best suited for very small teams.
This strategy also supports continuous integration and continuous delivery (CI/CD).