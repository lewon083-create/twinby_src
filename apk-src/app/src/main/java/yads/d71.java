package yads;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f37661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x61 f37662b;

    public d71(Context context, x61 x61Var) {
        this.f37661a = context;
        this.f37662b = x61Var;
    }

    public final c71 a(String str) {
        try {
            File fileA = this.f37662b.a();
            File parentFile = fileA.getParentFile();
            long freeSpace = parentFile != null ? parentFile.getFreeSpace() : 0L;
            byte[] array = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(array, "getBytes(...)");
            if (array.length >= freeSpace) {
                return new z61("Not enough space error");
            }
            Intrinsics.checkNotNullParameter(fileA, "<this>");
            Intrinsics.checkNotNullParameter(array, "array");
            FileOutputStream fileOutputStream = new FileOutputStream(fileA);
            try {
                fileOutputStream.write(array);
                Unit unit = Unit.f27471a;
                fileOutputStream.close();
                return new b71(u1.c.getUriForFile(this.f37661a, this.f37661a.getPackageName() + ".monetization.ads.inspector.fileprovider", fileA));
            } finally {
            }
        } catch (Exception unused) {
            return new z61("Failed to save report");
        }
    }
}
