package zk;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b0 {

    @NotNull
    public static final a0 Companion = new a0();

    @NotNull
    public static final b0 create(@NotNull String str, @Nullable p pVar) {
        Companion.getClass();
        return a0.a(str, pVar);
    }

    public abstract long contentLength();

    public abstract p contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(nl.h hVar);

    @NotNull
    public static final b0 create(@Nullable p pVar, @NotNull File file) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new y(pVar, file, 0);
    }

    @NotNull
    public static final b0 create(@Nullable p pVar, @NotNull String content) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return a0.a(content, pVar);
    }

    @NotNull
    public static final b0 create(@Nullable p pVar, @NotNull nl.j content) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(content, "<this>");
        return new y(pVar, content, 1);
    }

    @NotNull
    public static final b0 create(@Nullable p pVar, @NotNull byte[] content) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        int length = content.length;
        Intrinsics.checkNotNullParameter(content, "content");
        return a0.b(pVar, content, 0, length);
    }

    @NotNull
    public static final b0 create(@Nullable p pVar, @NotNull byte[] content, int i) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        int length = content.length;
        Intrinsics.checkNotNullParameter(content, "content");
        return a0.b(pVar, content, i, length);
    }

    @NotNull
    public static final b0 create(@NotNull byte[] bArr) {
        a0 a0Var = Companion;
        a0Var.getClass();
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return a0.c(a0Var, bArr, null, 0, 7);
    }

    @NotNull
    public static final b0 create(@NotNull byte[] bArr, @Nullable p pVar) {
        a0 a0Var = Companion;
        a0Var.getClass();
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return a0.c(a0Var, bArr, pVar, 0, 6);
    }

    @NotNull
    public static final b0 create(@NotNull byte[] bArr, @Nullable p pVar, int i) {
        a0 a0Var = Companion;
        a0Var.getClass();
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return a0.c(a0Var, bArr, pVar, i, 4);
    }

    @NotNull
    public static final b0 create(@NotNull byte[] bArr, @Nullable p pVar, int i, int i10) {
        Companion.getClass();
        return a0.b(pVar, bArr, i, i10);
    }

    @NotNull
    public static final b0 create(@NotNull nl.j jVar, @Nullable p pVar) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return new y(pVar, jVar, 1);
    }

    @NotNull
    public static final b0 create(@NotNull File file, @Nullable p pVar) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new y(pVar, file, 0);
    }

    @NotNull
    public static final b0 create(@Nullable p pVar, @NotNull byte[] content, int i, int i10) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return a0.b(pVar, content, i, i10);
    }
}
