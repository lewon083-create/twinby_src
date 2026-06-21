package c4;

import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.measurement.b4;
import e5.i;
import g5.c;
import j3.o;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f2206a = new a();

    public final b4 a(o oVar) {
        String str = oVar.f26335n;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new a5.b(0);
                case "application/x-icy":
                    return new d5.a();
                case "application/id3":
                    return new i(null);
                case "application/x-emsg":
                    return new a5.b(1);
                case "application/x-scte35":
                    return new c();
            }
        }
        throw new IllegalArgumentException(om1.k("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final boolean b(o oVar) {
        String str = oVar.f26335n;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
