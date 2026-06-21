package c7;

import java.io.File;
import java.math.BigInteger;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Unit;
import kotlin.collections.b0;
import kotlin.collections.t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;
import kotlin.text.StringsKt;
import p2.i0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends r implements Function0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2244f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2245g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i, Object obj) {
        super(0);
        this.f2244f = i;
        this.f2245g = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.r] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f2244f) {
            case 0:
                j jVar = (j) this.f2245g;
                return BigInteger.valueOf(jVar.f2247b).shiftLeft(32).or(BigInteger.valueOf(jVar.f2248c)).shiftLeft(32).or(BigInteger.valueOf(jVar.f2249d));
            case 1:
                zk.j jVar2 = ((dl.j) this.f2245g).f15856e;
                Intrinsics.b(jVar2);
                List<Certificate> listA = jVar2.a();
                ArrayList arrayList = new ArrayList(t.j(listA, 10));
                for (Certificate certificate : listA) {
                    Intrinsics.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            case 2:
                Object obj = i0.f30983d;
                File file = (File) this.f2245g;
                synchronized (obj) {
                    i0.f30982c.remove(file.getAbsolutePath());
                }
                return Unit.f27471a;
            case 3:
                File file2 = (File) ((f7.j) this.f2245g).invoke();
                Intrinsics.checkNotNullParameter(file2, "<this>");
                String name = file2.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (Intrinsics.a(StringsKt.N(name, ""), "preferences_pb")) {
                    File absoluteFile = file2.getAbsoluteFile();
                    Intrinsics.checkNotNullExpressionValue(absoluteFile, "file.absoluteFile");
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + file2 + " does not match required extension for Preferences file: preferences_pb").toString());
            case 4:
                return (List) this.f2245g;
            default:
                try {
                    return (List) ((r) this.f2245g).invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return b0.f27475b;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(Function0 function0) {
        super(0);
        this.f2244f = 5;
        this.f2245g = (r) function0;
    }
}
