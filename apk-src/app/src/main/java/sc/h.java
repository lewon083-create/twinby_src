package sc;

import com.google.android.play.core.integrity.IntegrityTokenRequest;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends IntegrityTokenRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f32900b;

    public h(String str, Long l10) {
        this.f32899a = str;
        this.f32900b = l10;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long a() {
        return this.f32900b;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String b() {
        return this.f32899a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            goto L37
        L4:
            boolean r1 = r6 instanceof com.google.android.play.core.integrity.IntegrityTokenRequest
            r2 = 0
            if (r1 == 0) goto L24
            r1 = r6
            com.google.android.play.core.integrity.IntegrityTokenRequest r1 = (com.google.android.play.core.integrity.IntegrityTokenRequest) r1
            java.lang.String r3 = r5.f32899a
            java.lang.String r4 = r1.b()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L24
            java.lang.Long r3 = r5.f32900b
            if (r3 != 0) goto L26
            java.lang.Long r1 = r1.a()
            if (r1 != 0) goto L24
        L22:
            r1 = r0
            goto L31
        L24:
            r1 = r2
            goto L31
        L26:
            java.lang.Long r1 = r1.a()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L24
            goto L22
        L31:
            boolean r6 = r6 instanceof sc.h
            if (r6 == 0) goto L39
            if (r1 == 0) goto L38
        L37:
            return r0
        L38:
            return r2
        L39:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sc.h.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = this.f32899a.hashCode() ^ 1000003;
        Long l10 = this.f32900b;
        return ((iHashCode * 1000003) ^ (l10 == null ? 0 : l10.hashCode())) * 1000003;
    }

    public final String toString() {
        return ("IntegrityTokenRequest{nonce=" + this.f32899a + ", cloudProjectNumber=" + this.f32900b).concat(", network=null").concat("}");
    }
}
