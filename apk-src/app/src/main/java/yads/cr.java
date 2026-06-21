package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class cr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sq0 f37478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public nq0 f37479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ld0 f37480c;

    public cr(sq0 sq0Var) {
        this.f37478a = sq0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0071, code lost:
    
        if (r7.f37479b != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0073, code lost:
    
        r13 = new java.lang.StringBuilder("None of the available extractors (");
        r14 = yads.lb3.f40466a;
        r14 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0084, code lost:
    
        if (r12 >= r8.length) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0086, code lost:
    
        r14.append(r8[r12].getClass().getSimpleName());
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0095, code lost:
    
        if (r12 >= (r8.length - 1)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0097, code lost:
    
        r14.append(", ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009c, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009f, code lost:
    
        r13.append(r14.toString());
        r13.append(") could read the stream.");
        r8 = r13.toString();
        r9.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b5, code lost:
    
        throw new yads.na3(r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(yads.p30 r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, yads.qq0 r15) throws yads.na3 {
        /*
            r7 = this;
            yads.ld0 r1 = new yads.ld0
            r2 = r8
            r3 = r11
            r5 = r13
            r1.<init>(r2, r3, r5)
            r7.f37480c = r1
            yads.nq0 r8 = r7.f37479b
            if (r8 == 0) goto Lf
            return
        Lf:
            yads.sq0 r8 = r7.f37478a
            yads.nq0[] r8 = r8.createExtractors(r9, r10)
            int r10 = r8.length
            r11 = 1
            r12 = 0
            if (r10 != r11) goto L20
            r8 = r8[r12]
            r7.f37479b = r8
            goto Lb6
        L20:
            int r10 = r8.length
            r13 = r12
        L22:
            if (r13 >= r10) goto L6f
            r14 = r8[r13]
            boolean r0 = r14.a(r1)     // Catch: java.lang.Throwable -> L31 java.io.EOFException -> L59
            if (r0 == 0) goto L34
            r7.f37479b = r14     // Catch: java.lang.Throwable -> L31 java.io.EOFException -> L59
            r1.f40507f = r12
            goto L6f
        L31:
            r0 = move-exception
            r8 = r0
            goto L45
        L34:
            yads.nq0 r14 = r7.f37479b
            if (r14 != 0) goto L6a
            long r5 = r1.f40505d
            int r14 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r14 != 0) goto L3f
            goto L6a
        L3f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L45:
            yads.nq0 r9 = r7.f37479b
            if (r9 != 0) goto L56
            long r9 = r1.f40505d
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 != 0) goto L50
            goto L56
        L50:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L56:
            r1.f40507f = r12
            throw r8
        L59:
            yads.nq0 r14 = r7.f37479b
            if (r14 != 0) goto L6a
            long r5 = r1.f40505d
            int r14 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r14 != 0) goto L64
            goto L6a
        L64:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L6a:
            r1.f40507f = r12
            int r13 = r13 + 1
            goto L22
        L6f:
            yads.nq0 r10 = r7.f37479b
            if (r10 != 0) goto Lb6
            yads.na3 r10 = new yads.na3
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "None of the available extractors ("
            r13.<init>(r14)
            int r14 = yads.lb3.f40466a
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
        L83:
            int r15 = r8.length
            if (r12 >= r15) goto L9f
            r15 = r8[r12]
            java.lang.Class r15 = r15.getClass()
            java.lang.String r15 = r15.getSimpleName()
            r14.append(r15)
            int r15 = r8.length
            int r15 = r15 - r11
            if (r12 >= r15) goto L9c
            java.lang.String r15 = ", "
            r14.append(r15)
        L9c:
            int r12 = r12 + 1
            goto L83
        L9f:
            java.lang.String r8 = r14.toString()
            r13.append(r8)
            java.lang.String r8 = ") could read the stream."
            r13.append(r8)
            java.lang.String r8 = r13.toString()
            r9.getClass()
            r10.<init>(r8)
            throw r10
        Lb6:
            yads.nq0 r8 = r7.f37479b
            r8.a(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.cr.a(yads.p30, android.net.Uri, java.util.Map, long, long, yads.qq0):void");
    }
}
