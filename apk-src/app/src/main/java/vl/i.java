package vl;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends o {
    @Override // vl.p
    public final String o() {
        return "#doctype";
    }

    @Override // vl.p
    public final void q(StringBuilder sb2, int i, g gVar) throws IOException {
        if (gVar.f34918h != 1 || v("publicId") || v("systemId")) {
            sb2.append("<!DOCTYPE");
        } else {
            sb2.append("<!doctype");
        }
        if (v("name")) {
            sb2.append(" ").append(b("name"));
        }
        if (v("pubSysKey")) {
            sb2.append(" ").append(b("pubSysKey"));
        }
        if (v("publicId")) {
            sb2.append(" \"").append(b("publicId")).append('\"');
        }
        if (v("systemId")) {
            sb2.append(" \"").append(b("systemId")).append('\"');
        }
        sb2.append('>');
    }

    public final boolean v(String str) {
        return !tl.a.c(b(str));
    }

    @Override // vl.p
    public final void r(StringBuilder sb2, int i, g gVar) {
    }
}
