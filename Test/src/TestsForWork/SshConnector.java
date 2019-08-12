package TestsForWork;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

public class SshConnector {
    public static void main(String[] args) {
        String user = "dn230483zav1";
        String password = "iATXe65l!";
        String host = "10.61.144.242";
        int port = 2233;
        String sshrsa = "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDV7YOSL7Foti4HL1KkzB7KKf9DIIA+ZkZIEctflcGdKKCeJftgQd9snFnG6hbrOCSQDg9P14y8vQXketnF/WJLHmQfhp4WrXbxX5yMx98g8MiAXLdYAooaPku6euy324l0DSRQxOdGOo4p2QA619CquZufGy15ytUVD6q9PyvVIbE3njbgSWdmRjUP2+o9kqwrSPqWHxOxiH+u2Kt54knd5SYvJDkglxCXLZlFkmwpHr/pZz8P8odUsWa7QoiXTehYmOfb+cACNbm5CXBxq452n2FMyZpNx4WP0bcz3NRW2LRyceqiA5t1aj578LqL2xjmJ1x/IRllqlHEXiSIyoG9 dn230483zav2@dnh0-2p32-55";
        //String remoteFile = "/home/john/test.txt";

        try {
            JSch jsch = new JSch();
            Session session = jsch.getSession(user, host, port);
            //session.setPassword(password);
            //FileWriter tmpwriter=new FileWriter("id_rsa.pub",true);
            //tmpwriter.append(host + " ssh-rsa " + sshrsa + "\n");
            //tmpwriter.flush();
            //tmpwriter.close();
            //session.setConfig("StrictHostKeyChecking", "no");
            //session.setConfig("HashKnownHosts", "yes");
            session.setConfig("StrictHostKeyChecking", "no");
            session.setConfig("HashKnownHosts", "no");
            System.out.println("Establishing Connection...");
            session.connect();
            System.out.println("Connection established.");
            System.out.println("Crating SFTP Channel.");
            ChannelSftp sftpChannel = (ChannelSftp) session.openChannel("sftp");
            sftpChannel.connect();
            System.out.println("SFTP Channel created.");

/*
            InputStream out = null;
            out = sftpChannel.get(remoteFile);
            BufferedReader br = new BufferedReader(new InputStreamReader(out));
            String line;
            while ((line = br.readLine()) != null)
                System.out.println(line);

            br.close();*/
        } catch (Exception e) {
            System.err.print(e);
        }
    }
}


