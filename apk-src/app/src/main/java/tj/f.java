package tj;

import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f33926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public File[] f33927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f33928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f33929e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, File rootDir) {
        super(rootDir);
        Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        this.f33929e = gVar;
    }

    @Override // tj.h
    public final File a() {
        Function2 function2;
        i iVar = this.f33929e.f33931c;
        boolean z5 = this.f33926b;
        File file = this.f33932a;
        if (z5) {
            File[] fileArr = this.f33927c;
            if (fileArr == null || this.f33928d < fileArr.length) {
                if (fileArr == null) {
                    File[] fileArrListFiles = file.listFiles();
                    this.f33927c = fileArrListFiles;
                    if (fileArrListFiles == null && (function2 = iVar.f33937e) != null) {
                        function2.invoke(file, new a(this.f33932a, null, "Cannot list files in a directory", 2, null));
                    }
                    File[] fileArr2 = this.f33927c;
                    if (fileArr2 == null || fileArr2.length == 0) {
                        Function1 function1 = iVar.f33936d;
                        if (function1 != null) {
                            function1.invoke(file);
                        }
                    }
                }
                File[] fileArr3 = this.f33927c;
                Intrinsics.b(fileArr3);
                int i = this.f33928d;
                this.f33928d = i + 1;
                return fileArr3[i];
            }
            Function1 function12 = iVar.f33936d;
            if (function12 != null) {
                function12.invoke(file);
                return null;
            }
        } else {
            Function1 function13 = iVar.f33935c;
            if (function13 == null || ((Boolean) function13.invoke(file)).booleanValue()) {
                this.f33926b = true;
                return file;
            }
        }
        return null;
    }
}
