package i0;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends FilterOutputStream {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f20795h = "Exif\u0000\u0000".getBytes(h.f20774d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f20796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f20797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ByteBuffer f20798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f20801g;

    public m(ByteArrayOutputStream byteArrayOutputStream, l lVar) {
        super(new BufferedOutputStream(byteArrayOutputStream, 65536));
        this.f20797c = new byte[1];
        this.f20798d = ByteBuffer.allocate(4);
        this.f20799e = 0;
        this.f20796b = lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0367, code lost:
    
        if (r3 <= 0) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0369, code lost:
    
        ((java.io.FilterOutputStream) r18).out.write(r19, r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x036e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:?, code lost:
    
        return;
     */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void write(byte[] r19, int r20, int r21) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 879
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.m.write(byte[], int, int):void");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        byte b2 = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
        byte[] bArr = this.f20797c;
        bArr[0] = b2;
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
