package aa;

import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.bt0;
import com.google.android.gms.internal.ads.k81;
import com.google.android.gms.internal.ads.qt;
import com.google.android.gms.internal.ads.st;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements k81 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ st f560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f562e;

    public /* synthetic */ c(l lVar, st stVar, boolean z5, int i) {
        this.f559b = i;
        this.f560c = stVar;
        this.f561d = z5;
        this.f562e = lVar;
    }

    @Override // com.google.android.gms.internal.ads.k81
    /* JADX INFO: renamed from: i */
    public final void mo6i(Object obj) {
        switch (this.f559b) {
            case 0:
                ArrayList<Uri> arrayList = (ArrayList) obj;
                try {
                    qt qtVar = (qt) this.f560c;
                    Parcel parcelD0 = qtVar.D0();
                    parcelD0.writeTypedList(arrayList);
                    qtVar.L1(parcelD0, 1);
                    l lVar = this.f562e;
                    boolean z5 = lVar.f633o;
                    bt0 bt0Var = lVar.f632n;
                    if (!z5 && !this.f561d) {
                    }
                    for (Uri uri : arrayList) {
                        if (l.p4(uri, lVar.A, lVar.B)) {
                            bt0Var.b(l.s4(lVar.f642x, uri, "1").toString(), null, null, null);
                        } else {
                            if (((Boolean) q9.s.f31967e.f31970c.a(al.f3095l8)).booleanValue()) {
                                bt0Var.b(uri.toString(), null, null, null);
                            }
                        }
                        break;
                    }
                } catch (RemoteException e3) {
                    u9.i.f("", e3);
                    return;
                }
                break;
            default:
                List<Uri> list = (List) obj;
                try {
                    l lVar2 = this.f562e;
                    lVar2.getClass();
                    ArrayList arrayList2 = lVar2.f644z;
                    ArrayList arrayList3 = lVar2.f643y;
                    bt0 bt0Var2 = lVar2.f632n;
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (l.p4((Uri) it.next(), arrayList3, arrayList2)) {
                                lVar2.f639u.getAndIncrement();
                            }
                        }
                    }
                    qt qtVar2 = (qt) this.f560c;
                    Parcel parcelD02 = qtVar2.D0();
                    parcelD02.writeTypedList(list);
                    qtVar2.L1(parcelD02, 1);
                    if (!lVar2.f634p && !this.f561d) {
                    }
                    for (Uri uri2 : list) {
                        if (l.p4(uri2, arrayList3, arrayList2)) {
                            bt0Var2.b(l.s4(lVar2.f642x, uri2, "1").toString(), null, null, null);
                        } else {
                            if (((Boolean) q9.s.f31967e.f31970c.a(al.f3095l8)).booleanValue()) {
                                bt0Var2.b(uri2.toString(), null, null, null);
                            }
                        }
                        break;
                    }
                } catch (RemoteException e7) {
                    u9.i.f("", e7);
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.k81
    public final void k(Throwable th2) {
        switch (this.f559b) {
            case 0:
                try {
                    st stVar = this.f560c;
                    String message = th2.getMessage();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 16);
                    sb2.append("Internal error: ");
                    sb2.append(message);
                    String string = sb2.toString();
                    qt qtVar = (qt) stVar;
                    Parcel parcelD0 = qtVar.D0();
                    parcelD0.writeString(string);
                    qtVar.L1(parcelD0, 2);
                } catch (RemoteException e3) {
                    u9.i.f("", e3);
                    return;
                }
                break;
            default:
                try {
                    st stVar2 = this.f560c;
                    String message2 = th2.getMessage();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + 16);
                    sb3.append("Internal error: ");
                    sb3.append(message2);
                    String string2 = sb3.toString();
                    qt qtVar2 = (qt) stVar2;
                    Parcel parcelD02 = qtVar2.D0();
                    parcelD02.writeString(string2);
                    qtVar2.L1(parcelD02, 2);
                } catch (RemoteException e7) {
                    u9.i.f("", e7);
                }
                break;
        }
    }
}
