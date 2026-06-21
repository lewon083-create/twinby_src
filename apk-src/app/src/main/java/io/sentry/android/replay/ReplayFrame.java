package io.sentry.android.replay;

import a0.u;
import androidx.compose.runtime.internal.StabilityInferred;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l7.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
@StabilityInferred(parameters = 0)
@Metadata
public final class ReplayFrame {
    public static final int $stable = 8;

    @Nullable
    private final String screen;

    @NotNull
    private final File screenshot;
    private final long timestamp;

    public ReplayFrame(@NotNull File screenshot, long j10, @Nullable String str) {
        Intrinsics.checkNotNullParameter(screenshot, "screenshot");
        this.screenshot = screenshot;
        this.timestamp = j10;
        this.screen = str;
    }

    public static /* synthetic */ ReplayFrame copy$default(ReplayFrame replayFrame, File file, long j10, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            file = replayFrame.screenshot;
        }
        if ((i & 2) != 0) {
            j10 = replayFrame.timestamp;
        }
        if ((i & 4) != 0) {
            str = replayFrame.screen;
        }
        return replayFrame.copy(file, j10, str);
    }

    @NotNull
    public final File component1() {
        return this.screenshot;
    }

    public final long component2() {
        return this.timestamp;
    }

    @Nullable
    public final String component3() {
        return this.screen;
    }

    @NotNull
    public final ReplayFrame copy(@NotNull File screenshot, long j10, @Nullable String str) {
        Intrinsics.checkNotNullParameter(screenshot, "screenshot");
        return new ReplayFrame(screenshot, j10, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReplayFrame)) {
            return false;
        }
        ReplayFrame replayFrame = (ReplayFrame) obj;
        return Intrinsics.a(this.screenshot, replayFrame.screenshot) && this.timestamp == replayFrame.timestamp && Intrinsics.a(this.screen, replayFrame.screen);
    }

    @Nullable
    public final String getScreen() {
        return this.screen;
    }

    @NotNull
    public final File getScreenshot() {
        return this.screenshot;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iD = o.d(this.timestamp, this.screenshot.hashCode() * 31, 31);
        String str = this.screen;
        return iD + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ReplayFrame(screenshot=");
        sb2.append(this.screenshot);
        sb2.append(", timestamp=");
        sb2.append(this.timestamp);
        sb2.append(", screen=");
        return u.n(sb2, this.screen, ')');
    }

    public /* synthetic */ ReplayFrame(File file, long j10, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, j10, (i & 4) != 0 ? null : str);
    }
}
