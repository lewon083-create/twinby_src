package vl;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends o {
    @Override // vl.p
    public final String o() {
        return "#comment";
    }

    @Override // vl.p
    public final void q(StringBuilder sb2, int i, g gVar) throws IOException {
        if (gVar.f34916f) {
            p.m(sb2, i, gVar);
        }
        sb2.append("<!--").append(t()).append("-->");
    }

    @Override // vl.p
    public final String toString() {
        return p();
    }

    @Override // vl.p
    public final void r(StringBuilder sb2, int i, g gVar) {
    }
}
