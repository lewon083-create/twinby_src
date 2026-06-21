package ma;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import pa.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class a implements ServiceConnection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f28757b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedBlockingQueue f28758c = new LinkedBlockingQueue();

    public final IBinder a() {
        c0.h("BlockingServiceConnection.getService() called on main thread");
        if (this.f28757b) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f28757b = true;
        return (IBinder) this.f28758c.take();
    }

    public final IBinder b() throws TimeoutException {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c0.h("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f28757b) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f28757b = true;
        IBinder iBinder = (IBinder) this.f28758c.poll(10000L, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f28758c.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
