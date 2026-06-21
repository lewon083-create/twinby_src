package yads;

import java.io.File;
import java.io.FileOutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hw0 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ iw0 f39347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tw0 f39348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f39349d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw0(iw0 iw0Var, tw0 tw0Var, byte[] bArr, mj.a aVar) {
        super(2, aVar);
        this.f39347b = iw0Var;
        this.f39348c = tw0Var;
        this.f39349d = bArr;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new hw0(this.f39347b, this.f39348c, this.f39349d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((hw0) create((hk.a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        com.google.android.gms.internal.measurement.h5.E(obj);
        try {
            File fileB = this.f39347b.b(this.f39348c);
            File parentFile = fileB.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(fileB);
            try {
                fileOutputStream.write(this.f39349d);
                fileOutputStream.flush();
                Unit unit = Unit.f27471a;
                fileOutputStream.close();
                return fileB;
            } finally {
            }
        } catch (Exception unused) {
            return null;
        }
    }
}
