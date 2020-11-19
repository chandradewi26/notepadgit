git fetch

download commits, files, and refs from a remote repo into local repo.

fetching is what you do when you want to see what everybody has been working on.

It doesn't force you to actually merge the changes into your repository.

Git isolates fetched content from existing local content; it has absolutely no effect on your local development work.

Fetched content has to be explicitly checked out using the git checkout command. 

This makes fetching a safe way to review commits before integrating them with your local repository.

When downloading content from a remote repo, git pull and git fetch commands are available to accomplish the task. You can consider git fetch the 'safe' version of the two commands. It will download the remote content but not update your local repo's working state, leaving your current work intact. git pull is the more aggressive alternative; it will download the remote content for the active local branch and immediately execute git merge to create a merge commit for the new remote content. If you have pending changes in progress this will cause conflicts and kick-off the merge conflict resolution flow.



The git pull command is used to fetch and download content from a remote repository and immediately update the local repository to match that content. Merging remote upstream changes into your local repository is a common task in Git-based collaboration work flows. The git pull command is actually a combination of two other commands, git fetch followed by git merge. In the first stage of operation git pull will execute a git fetch scoped to the local branch that HEAD is pointed at. Once the content is downloaded, git pull will enter a merge workflow. A new merge commit will be-created and HEAD updated to point at the new commit.


PULL MERGE & PULL REBASE
https://www.atlassian.com/git/tutorials/syncing/git-pull