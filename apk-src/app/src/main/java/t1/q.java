package t1;

import android.app.Notification;
import android.os.Parcel;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f33375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Notification f33376c;

    public q(String str, int i, Notification notification) {
        this.f33374a = str;
        this.f33375b = i;
        this.f33376c = notification;
    }

    public final void a(c.c cVar) {
        String str = this.f33374a;
        int i = this.f33375b;
        Notification notification = this.f33376c;
        c.a aVar = (c.a) cVar;
        aVar.getClass();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(c.c.v1);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            parcelObtain.writeString(null);
            parcelObtain.writeTypedObject(notification, 0);
            aVar.f2176b.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotifyTask[packageName:");
        sb2.append(this.f33374a);
        sb2.append(", id:");
        return z.d(this.f33375b, ", tag:null]", sb2);
    }
}
