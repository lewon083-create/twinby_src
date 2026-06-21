package i0;

import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends FilterOutputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20763b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteOrder f20764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OutputStream f20765d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(OutputStream outputStream) {
        super(outputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.f20765d = outputStream;
        this.f20764c = byteOrder;
    }

    public void a(int i) throws IOException {
        ((DataOutputStream) this.f20765d).write(i);
    }

    public final void b(int i) throws IOException {
        switch (this.f20763b) {
            case 0:
                ByteOrder byteOrder = this.f20764c;
                ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
                OutputStream outputStream = this.f20765d;
                if (byteOrder == byteOrder2) {
                    outputStream.write(i & KotlinVersion.MAX_COMPONENT_VALUE);
                    outputStream.write((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                    outputStream.write((i >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                    outputStream.write((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                    outputStream.write((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                    outputStream.write((i >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                    outputStream.write((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                    outputStream.write(i & KotlinVersion.MAX_COMPONENT_VALUE);
                }
                break;
            default:
                DataOutputStream dataOutputStream = (DataOutputStream) this.f20765d;
                ByteOrder byteOrder3 = this.f20764c;
                if (byteOrder3 == ByteOrder.LITTLE_ENDIAN) {
                    dataOutputStream.write(i & KotlinVersion.MAX_COMPONENT_VALUE);
                    dataOutputStream.write((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                    dataOutputStream.write((i >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                    dataOutputStream.write((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                } else if (byteOrder3 == ByteOrder.BIG_ENDIAN) {
                    dataOutputStream.write((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                    dataOutputStream.write((i >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                    dataOutputStream.write((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                    dataOutputStream.write(i & KotlinVersion.MAX_COMPONENT_VALUE);
                }
                break;
        }
    }

    public final void d(short s10) throws IOException {
        switch (this.f20763b) {
            case 0:
                ByteOrder byteOrder = this.f20764c;
                ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
                OutputStream outputStream = this.f20765d;
                if (byteOrder == byteOrder2) {
                    outputStream.write(s10 & 255);
                    outputStream.write((s10 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                    outputStream.write((s10 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                    outputStream.write(s10 & 255);
                }
                break;
            default:
                DataOutputStream dataOutputStream = (DataOutputStream) this.f20765d;
                ByteOrder byteOrder3 = this.f20764c;
                if (byteOrder3 == ByteOrder.LITTLE_ENDIAN) {
                    dataOutputStream.write(s10 & 255);
                    dataOutputStream.write((s10 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                } else if (byteOrder3 == ByteOrder.BIG_ENDIAN) {
                    dataOutputStream.write((s10 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                    dataOutputStream.write(s10 & 255);
                }
                break;
        }
    }

    public void h(long j10) throws IOException {
        if (j10 > 4294967295L) {
            throw new IllegalArgumentException("val is larger than the maximum value of a 32-bit unsigned integer");
        }
        b((int) j10);
    }

    public void i(int i) throws IOException {
        if (i > 65535) {
            throw new IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
        }
        d((short) i);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        switch (this.f20763b) {
            case 0:
                this.f20765d.write(bArr);
                break;
            default:
                ((DataOutputStream) this.f20765d).write(bArr);
                break;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i10) throws IOException {
        switch (this.f20763b) {
            case 0:
                this.f20765d.write(bArr, i, i10);
                break;
            default:
                ((DataOutputStream) this.f20765d).write(bArr, i, i10);
                break;
        }
    }

    public c(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f20765d = new DataOutputStream(outputStream);
        this.f20764c = byteOrder;
    }
}
