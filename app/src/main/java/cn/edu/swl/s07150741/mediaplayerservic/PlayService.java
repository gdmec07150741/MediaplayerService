package cn.edu.swl.s07150741.mediaplayerservic;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by asus on 2016/11/18.
 */
public class PlayService extends Service {
    MediaPlayer mediaPlayer;
    public PlayService(){

    }
    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Mot yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        mediaPlayer.start();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mediaPlayer = MediaPlayer.create(this,R.raw.exodus);
        mediaPlayer.setLooping(true);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mediaPlayer.stop();
        mediaPlayer.release();
    }
}
