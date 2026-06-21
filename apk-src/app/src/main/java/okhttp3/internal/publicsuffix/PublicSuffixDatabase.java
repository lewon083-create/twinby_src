package okhttp3.internal.publicsuffix;

import a0.u;
import ek.c;
import ek.d;
import fh.nd;
import hl.n;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b0;
import kotlin.collections.r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.f0;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import nl.m;
import nl.o;
import nl.z;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f30742e = {42};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List f30743f = r.c("*");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final PublicSuffixDatabase f30744g = new PublicSuffixDatabase();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f30745a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CountDownLatch f30746b = new CountDownLatch(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f30747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f30748d;

    public static List c(String str) {
        List listJ = StringsKt.J(str, new char[]{'.'});
        return Intrinsics.a(CollectionsKt.J(listJ), "") ? CollectionsKt.A(listJ) : listJ;
    }

    public final String a(String domain) {
        String strE;
        String strE2;
        String strE3;
        List listJ;
        List listJ2;
        int size;
        int size2;
        Intrinsics.checkNotNullParameter(domain, "domain");
        String unicodeDomain = IDN.toUnicode(domain);
        Intrinsics.checkNotNullExpressionValue(unicodeDomain, "unicodeDomain");
        List listC = c(unicodeDomain);
        if (this.f30745a.get() || !this.f30745a.compareAndSet(false, true)) {
            try {
                this.f30746b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z5 = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z5 = true;
                    } catch (IOException e3) {
                        n nVar = n.f20755a;
                        n.f20755a.getClass();
                        n.i("Failed to read public suffix list", e3, 5);
                        if (z5) {
                        }
                    }
                } finally {
                    if (z5) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (this.f30747c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size3 = listC.size();
        byte[][] bArr = new byte[size3][];
        for (int i = 0; i < size3; i++) {
            String str = (String) listC.get(i);
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            byte[] bytes = str.getBytes(UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i] = bytes;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= size3) {
                strE = null;
                break;
            }
            byte[] bArr2 = this.f30747c;
            if (bArr2 == null) {
                Intrinsics.g("publicSuffixListBytes");
                throw null;
            }
            strE = nd.e(bArr2, bArr, i10);
            if (strE != null) {
                break;
            }
            i10++;
        }
        if (size3 > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i11 = 0; i11 < length; i11++) {
                bArr3[i11] = f30742e;
                byte[] bArr4 = this.f30747c;
                if (bArr4 == null) {
                    Intrinsics.g("publicSuffixListBytes");
                    throw null;
                }
                strE2 = nd.e(bArr4, bArr3, i11);
                if (strE2 != null) {
                    break;
                }
            }
            strE2 = null;
        } else {
            strE2 = null;
        }
        if (strE2 != null) {
            int i12 = size3 - 1;
            for (int i13 = 0; i13 < i12; i13++) {
                byte[] bArr5 = this.f30748d;
                if (bArr5 == null) {
                    Intrinsics.g("publicSuffixExceptionListBytes");
                    throw null;
                }
                strE3 = nd.e(bArr5, bArr, i13);
                if (strE3 != null) {
                    break;
                }
            }
            strE3 = null;
        } else {
            strE3 = null;
        }
        if (strE3 != null) {
            listJ2 = StringsKt.J("!".concat(strE3), new char[]{'.'});
        } else if (strE == null && strE2 == null) {
            listJ2 = f30743f;
        } else {
            if (strE == null || (listJ = StringsKt.J(strE, new char[]{'.'})) == null) {
                listJ = b0.f27475b;
            }
            if (strE2 == null || (listJ2 = StringsKt.J(strE2, new char[]{'.'})) == null) {
                listJ2 = b0.f27475b;
            }
            if (listJ.size() > listJ2.size()) {
                listJ2 = listJ;
            }
        }
        if (listC.size() == listJ2.size() && ((String) listJ2.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listJ2.get(0)).charAt(0) == '!') {
            size = listC.size();
            size2 = listJ2.size();
        } else {
            size = listC.size();
            size2 = listJ2.size() + 1;
        }
        int i14 = size - size2;
        Sequence sequenceW = CollectionsKt.w(c(domain));
        Intrinsics.checkNotNullParameter(sequenceW, "<this>");
        if (i14 < 0) {
            throw new IllegalArgumentException(u.k(i14, "Requested element count ", " is less than zero.").toString());
        }
        if (i14 != 0) {
            sequenceW = sequenceW instanceof d ? ((d) sequenceW).a(i14) : new c(sequenceW, i14);
        }
        return ek.u.d(sequenceW, ".", null, 62);
    }

    public final void b() {
        try {
            f0 f0Var = new f0();
            f0 f0Var2 = new f0();
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                Logger logger = o.f29555a;
                Intrinsics.checkNotNullParameter(resourceAsStream, "<this>");
                nl.r rVarG = i0.o.g(new m(new nl.d(resourceAsStream, new z())));
                try {
                    long j10 = rVarG.readInt();
                    rVarG.E(j10);
                    f0Var.f27510b = rVarG.f29563c.k(j10);
                    long j11 = rVarG.readInt();
                    rVarG.E(j11);
                    f0Var2.f27510b = rVarG.f29563c.k(j11);
                    Unit unit = Unit.f27471a;
                    rVarG.close();
                    synchronized (this) {
                        Object obj = f0Var.f27510b;
                        Intrinsics.b(obj);
                        this.f30747c = (byte[]) obj;
                        Object obj2 = f0Var2.f27510b;
                        Intrinsics.b(obj2);
                        this.f30748d = (byte[]) obj2;
                    }
                } finally {
                }
            }
        } finally {
            this.f30746b.countDown();
        }
    }
}
