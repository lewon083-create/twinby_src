package yads;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteArrayOutputStream f45460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataOutputStream f45461b;

    public zm0() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f45460a = byteArrayOutputStream;
        this.f45461b = new DataOutputStream(byteArrayOutputStream);
    }

    public final byte[] a(xm0 xm0Var) {
        this.f45460a.reset();
        try {
            DataOutputStream dataOutputStream = this.f45461b;
            dataOutputStream.writeBytes(xm0Var.f44762b);
            dataOutputStream.writeByte(0);
            String str = xm0Var.f44763c;
            if (str == null) {
                str = "";
            }
            DataOutputStream dataOutputStream2 = this.f45461b;
            dataOutputStream2.writeBytes(str);
            dataOutputStream2.writeByte(0);
            this.f45461b.writeLong(xm0Var.f44764d);
            this.f45461b.writeLong(xm0Var.f44765e);
            this.f45461b.write(xm0Var.f44766f);
            this.f45461b.flush();
            return this.f45460a.toByteArray();
        } catch (IOException e3) {
            throw new RuntimeException(e3);
        }
    }
}
