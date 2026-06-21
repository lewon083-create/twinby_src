package i6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f21183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f21184d;

    public g(int i, int i10, long j10, long j11) {
        this.f21181a = i;
        this.f21182b = i10;
        this.f21183c = j10;
        this.f21184d = j11;
    }

    public static g a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            g gVar = new g(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return gVar;
        } finally {
        }
    }

    public final void b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f21181a);
            dataOutputStream.writeInt(this.f21182b);
            dataOutputStream.writeLong(this.f21183c);
            dataOutputStream.writeLong(this.f21184d);
            dataOutputStream.close();
        } catch (Throwable th2) {
            try {
                dataOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof g)) {
            g gVar = (g) obj;
            if (this.f21182b == gVar.f21182b && this.f21183c == gVar.f21183c && this.f21181a == gVar.f21181a && this.f21184d == gVar.f21184d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f21182b), Long.valueOf(this.f21183c), Integer.valueOf(this.f21181a), Long.valueOf(this.f21184d));
    }
}
