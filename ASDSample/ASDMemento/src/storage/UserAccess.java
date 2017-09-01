package storage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

import application.User;

public class UserAccess implements DataAccess {
	
	public static final String OUTPUT_DIR = System.getProperty("user.dir") 
			+ "/src/storage";
	@Override
	public void saveData(User user) {
		ObjectOutputStream out = null;
		try{
		
			Path path = FileSystems.getDefault().getPath(OUTPUT_DIR.concat("/"), user.getId().toString());
			out = new ObjectOutputStream(Files.newOutputStream(path));
			out.writeObject(user);
		}catch(IOException e){
			e.printStackTrace();

			}finally{
				if(out != null){
					try{
						out.close();
					}catch(Exception e){}
				}

		}		
	}

	@Override
	public User readUser(Integer id) {
		ObjectInputStream in = null;
		User user = null;
		try {
			Path path = FileSystems.getDefault().getPath(OUTPUT_DIR.concat("/"), id.toString());
			in = new ObjectInputStream(Files.newInputStream(path));
			user = (User)in.readObject();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(in != null) {
				try {
					in.close();
				} catch(Exception e) {}
			}
		}
		return user;
	}

}
