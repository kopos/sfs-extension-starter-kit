# sfs-extension-starter-kit
Starting an SFS Extension project the right way using ant

# Setup

- Create a build.properties (Use build.properties.sample file as template)
- Set the sfs.home directory path
- Use `ant deploy` to build the projec
- Use `ant clean` to clean previous class files and jar files
- Use `ant compile` to compile the sources to generate .class files
- Use `ant build` to build the extension jar file
- Use `ant deploy` to deploy the extension jar and zone file to SFS2X server
