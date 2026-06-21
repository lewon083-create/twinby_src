package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ws1 implements xs1 {
    public final gz2 a(nx0 nx0Var) {
        String str = nx0Var.f41375m;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new ng();
                case "application/x-icy":
                    return new o21();
                case "application/id3":
                    return new v21(null);
                case "application/x-emsg":
                    return new ym0();
                case "application/x-scte35":
                    return new n23();
            }
        }
        throw new IllegalArgumentException(com.google.android.gms.internal.ads.om1.k("Attempted to create decoder for unsupported MIME type: ", str));
    }
}
