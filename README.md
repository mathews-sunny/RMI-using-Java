# RMI-using-Java
Implementation of RMI using Java

Remote Method Invocation (RMI) allows objects to invoke methods of objects running in another machines. 
The remote communication is made possible by using Stub ( Client side interface) and skeleton (Server side interface)

1. Create the remote interface (rmiinterface.java)
2. Provide the implementation of the remote interface (client.java and server.java)
3. Compile the implementation class and interface (eg : javac client.java)
4. create the stub and skeleton objects using the rmic tool (command : rmic server)
5. Start the registry service by rmiregistry tool (command : rmiregistry)
6. Create and start the server application (command : java server)
7. Create and start the client application (command : java client)
