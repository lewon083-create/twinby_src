package androidx.datastore.preferences.protobuf;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class m extends IOException {
    public /* synthetic */ m(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public m(long j10, long j11, int i, IndexOutOfBoundsException indexOutOfBoundsException, int i10) {
        switch (i10) {
            case 5:
                Locale locale = Locale.US;
                StringBuilder sbN = gf.a.n("Pos: ", ", limit: ", j10);
                sbN.append(j11);
                sbN.append(", len: ");
                sbN.append(i);
                super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbN.toString()), indexOutOfBoundsException);
                break;
            case 6:
                Locale locale2 = Locale.US;
                StringBuilder sbN2 = gf.a.n("Pos: ", ", limit: ", j10);
                sbN2.append(j11);
                sbN2.append(", len: ");
                sbN2.append(i);
                super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbN2.toString()), indexOutOfBoundsException);
                break;
            default:
                Locale locale3 = Locale.US;
                StringBuilder sbN3 = gf.a.n("Pos: ", ", limit: ", j10);
                sbN3.append(j11);
                sbN3.append(", len: ");
                sbN3.append(i);
                super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbN3.toString()), indexOutOfBoundsException);
                break;
        }
    }

    public m(File file, File file2, String str) {
        Intrinsics.checkNotNullParameter(file, "file");
        StringBuilder sb2 = new StringBuilder(file.toString());
        if (file2 != null) {
            sb2.append(" -> " + file2);
        }
        if (str != null) {
            sb2.append(": ".concat(str));
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        super(string);
    }
}
