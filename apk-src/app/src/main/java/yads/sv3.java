package yads;

import android.webkit.WebView;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class sv3 implements sw3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final sv3 f43095f = new sv3(new uw3());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ex3 f43096a = new ex3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Date f43097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f43098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uw3 f43099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f43100e;

    public sv3(uw3 uw3Var) {
        this.f43099d = uw3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.sw3
    public final void a(boolean z5) {
        if (!this.f43100e && z5) {
            this.f43096a.getClass();
            Date date = new Date();
            Date date2 = this.f43097b;
            if (date2 == null || date.after(date2)) {
                this.f43097b = date;
                if (this.f43098c) {
                    Iterator it = Collections.unmodifiableCollection(qw3.f42411c.f42413b).iterator();
                    while (it.hasNext()) {
                        ka kaVar = ((zv3) it.next()).f45556e;
                        Date date3 = this.f43097b;
                        Date date4 = date3 != null ? (Date) date3.clone() : null;
                        kaVar.getClass();
                        if (date4 != null) {
                            JSONObject jSONObject = new JSONObject();
                            ow3.a(jSONObject, "timestamp", Long.valueOf(date4.getTime()));
                            lx3.f40715a.a((WebView) kaVar.f40127b.get(), "setLastActivity", jSONObject);
                        }
                    }
                }
            }
        }
        this.f43100e = z5;
    }
}
