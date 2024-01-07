# JAVA-ChatRooms
Java ChatRooms GUI app

This is an enhanced chat application developed as part of an exercise/exam. Users can send private messages, create chat rooms, and perform various actions on the chat server.

## Features

- **Chat Rooms:** Users can create chat rooms using the command `/Create @room_name`.
- **Invitations:** Users can invite others to join a chat room using the command `/Invite @room_name @user_name`.
- **List Rooms:** Users can list all chat rooms with the command `/ListRooms`.
- **Join Chat Room:** Users can connect to a chat room using the command `/Join @room_name`.
- **Set Active Chat Room:** Users can set active rooms using the command `/Room @room_name`.
- **Retrieve Messages:** Users receive the last 5 messages from a chat room upon joining. Additional messages can be requested with `/GetMoreMessages`.
- **Retrieve Chat History:** Users can request to see just the chat history, formatted as a server info response. This can be requested with `/History @num_msg`.
- **Private messaging system:** Users can send private chat messages one to another using the command `/Private @user @msg`.
- **Edit Messages:** Users can edit their messages by clicking on **Edit** button next to a message, and writing a new one. Other users see a note "(Ed.)" next to edited messages.
- **Reply to Messages:** Users can reply to messages.

Each user is displayed in one original color, based on the username hash, which provides better UI experience as each user is easily recognizable.

## Technologies Used

- Java
- JavaFX (for the graphical user interface)
- [KryoNet](https://github.com/EsotericSoftware/kryonet) (for network communication)

## Usage

1. Clone the repository:

```bash
git clone https://github.com/djordje34/JAVA-ChatRooms.git
cd JAVA-ChatRooms
```
2. Build and run application. Provided .bat files for ease of usage.
   
