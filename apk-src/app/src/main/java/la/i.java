package la;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f28081c;

    public /* synthetic */ i(k kVar, int i) {
        this.f28080b = i;
        this.f28081c = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28080b) {
            case 0:
                break;
            case 1:
                k kVar = this.f28081c;
                synchronized (kVar) {
                    if (kVar.f28084b == 1) {
                        kVar.a("Timed out while binding");
                    }
                    break;
                }
                return;
            default:
                this.f28081c.a("Service disconnected");
                return;
        }
        while (true) {
            k kVar2 = this.f28081c;
            synchronized (kVar2) {
                try {
                    if (kVar2.f28084b != 2) {
                        return;
                    }
                    if (kVar2.f28087e.isEmpty()) {
                        kVar2.c();
                        return;
                    }
                    l lVar = (l) kVar2.f28087e.poll();
                    kVar2.f28088f.put(lVar.f28090a, lVar);
                    ((ScheduledExecutorService) kVar2.f28089g.f28100e).schedule(new ed.c(17, kVar2, lVar), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(lVar)));
                    }
                    m mVar = kVar2.f28089g;
                    Messenger messenger = kVar2.f28085c;
                    int i = lVar.f28092c;
                    Context context = (Context) mVar.f28099d;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i;
                    messageObtain.arg1 = lVar.f28090a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", lVar.a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", lVar.f28093d);
                    messageObtain.setData(bundle);
                    try {
                        l6.i iVar = kVar2.f28086d;
                        Messenger messenger2 = (Messenger) iVar.f27978c;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            g gVar = (g) iVar.f27979d;
                            if (gVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = gVar.f28076b;
                            messenger3.getClass();
                            messenger3.send(messageObtain);
                        }
                    } catch (RemoteException e3) {
                        kVar2.a(e3.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
