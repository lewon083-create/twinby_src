package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class x43 implements y43 {
    public final v43 a(nx0 nx0Var) {
        String str = nx0Var.f41375m;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new fl0(nx0Var.f41377o);
                case "application/pgs":
                    return new mc2();
                case "application/x-mp4-vtt":
                    return new nv1();
                case "text/vtt":
                    return new uo3();
                case "application/x-quicktime-tx3g":
                    return new aa3(nx0Var.f41377o);
                case "text/x-ssa":
                    return new e33(nx0Var.f41377o);
                case "application/x-mp4-cea-608":
                case "application/cea-608":
                    return new ht(str, nx0Var.E);
                case "text/x-exoplayer-cues":
                    return new wp0();
                case "application/cea-708":
                    return new mt(nx0Var.E, nx0Var.f41377o);
                case "application/x-subrip":
                    return new s43();
                case "application/ttml+xml":
                    return new u93();
            }
        }
        throw new IllegalArgumentException(com.google.android.gms.internal.ads.om1.k("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final boolean b(nx0 nx0Var) {
        String str = nx0Var.f41375m;
        return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str);
    }
}
