package pa;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.ads.kw0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends kw0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f31353b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(e eVar, Looper looper) {
        super(looper, 4);
        this.f31353b = eVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        x xVar;
        e eVar = this.f31353b;
        if (eVar.f31349x.get() != message.arg1) {
            int i = message.what;
            if ((i == 2 || i == 1 || i == 7) && (xVar = (x) message.obj) != null) {
                synchronized (xVar) {
                    xVar.f31447a = null;
                }
                e eVar2 = xVar.f31449c;
                synchronized (eVar2.f31337l) {
                    eVar2.f31337l.remove(xVar);
                }
                return;
            }
            return;
        }
        int i10 = message.what;
        if ((i10 == 1 || i10 == 7 || i10 == 4 || i10 == 5) && !eVar.s()) {
            x xVar2 = (x) message.obj;
            if (xVar2 != null) {
                synchronized (xVar2) {
                    xVar2.f31447a = null;
                }
                e eVar3 = xVar2.f31449c;
                synchronized (eVar3.f31337l) {
                    eVar3.f31337l.remove(xVar2);
                }
                return;
            }
            return;
        }
        int i11 = message.what;
        if (i11 == 4) {
            eVar.f31346u = new ma.b(message.arg2, null, null);
            if (!eVar.f31347v && !TextUtils.isEmpty(eVar.o()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(eVar.o());
                    if (!eVar.f31347v) {
                        eVar.w(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            ma.b bVar = eVar.f31346u;
            if (bVar == null) {
                bVar = new ma.b(8, null, null);
            }
            eVar.f31335j.a(bVar);
            System.currentTimeMillis();
            return;
        }
        if (i11 == 5) {
            ma.b bVar2 = eVar.f31346u;
            if (bVar2 == null) {
                bVar2 = new ma.b(8, null, null);
            }
            eVar.f31335j.a(bVar2);
            System.currentTimeMillis();
            return;
        }
        if (i11 == 3) {
            Object obj = message.obj;
            eVar.f31335j.a(new ma.b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null));
            System.currentTimeMillis();
            return;
        }
        if (i11 == 6) {
            eVar.w(5, null);
            b bVar3 = eVar.f31340o;
            if (bVar3 != null) {
                bVar3.l0(message.arg2);
            }
            eVar.t();
            eVar.v(5, 1, null);
            return;
        }
        if (i11 == 2 && !eVar.r()) {
            x xVar3 = (x) message.obj;
            if (xVar3 != null) {
                synchronized (xVar3) {
                    xVar3.f31447a = null;
                }
                e eVar4 = xVar3.f31449c;
                synchronized (eVar4.f31337l) {
                    eVar4.f31337l.remove(xVar3);
                }
                return;
            }
            return;
        }
        int i12 = message.what;
        if (i12 != 2 && i12 != 1 && i12 != 7) {
            Log.wtf("GmsClient", l7.o.j(i12, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i12).length() + 34)), new Exception());
            return;
        }
        x xVar4 = (x) message.obj;
        synchronized (xVar4) {
            try {
                bool = xVar4.f31447a;
                if (xVar4.f31448b) {
                    String string = xVar4.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 47);
                    sb2.append("Callback proxy ");
                    sb2.append(string);
                    sb2.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb2.toString());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (bool != null) {
            e eVar5 = xVar4.f31452f;
            int i13 = xVar4.f31450d;
            if (i13 != 0) {
                eVar5.w(1, null);
                Bundle bundle = xVar4.f31451e;
                xVar4.b(new ma.b(i13, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!xVar4.a()) {
                eVar5.w(1, null);
                xVar4.b(new ma.b(8, null, null));
            }
        }
        synchronized (xVar4) {
            xVar4.f31448b = true;
        }
        synchronized (xVar4) {
            xVar4.f31447a = null;
        }
        e eVar6 = xVar4.f31449c;
        synchronized (eVar6.f31337l) {
            eVar6.f31337l.remove(xVar4);
        }
    }
}
