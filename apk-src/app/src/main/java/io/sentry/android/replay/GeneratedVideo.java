package io.sentry.android.replay;

import a0.u;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.internal.ads.om1;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
public final class GeneratedVideo {
    public static final int $stable = 8;
    private final long duration;
    private final int frameCount;

    @NotNull
    private final File video;

    public GeneratedVideo(@NotNull File video, int i, long j10) {
        Intrinsics.checkNotNullParameter(video, "video");
        this.video = video;
        this.frameCount = i;
        this.duration = j10;
    }

    public static /* synthetic */ GeneratedVideo copy$default(GeneratedVideo generatedVideo, File file, int i, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            file = generatedVideo.video;
        }
        if ((i10 & 2) != 0) {
            i = generatedVideo.frameCount;
        }
        if ((i10 & 4) != 0) {
            j10 = generatedVideo.duration;
        }
        return generatedVideo.copy(file, i, j10);
    }

    @NotNull
    public final File component1() {
        return this.video;
    }

    public final int component2() {
        return this.frameCount;
    }

    public final long component3() {
        return this.duration;
    }

    @NotNull
    public final GeneratedVideo copy(@NotNull File video, int i, long j10) {
        Intrinsics.checkNotNullParameter(video, "video");
        return new GeneratedVideo(video, i, j10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeneratedVideo)) {
            return false;
        }
        GeneratedVideo generatedVideo = (GeneratedVideo) obj;
        return Intrinsics.a(this.video, generatedVideo.video) && this.frameCount == generatedVideo.frameCount && this.duration == generatedVideo.duration;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getFrameCount() {
        return this.frameCount;
    }

    @NotNull
    public final File getVideo() {
        return this.video;
    }

    public int hashCode() {
        return Long.hashCode(this.duration) + u.g(this.frameCount, this.video.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("GeneratedVideo(video=");
        sb2.append(this.video);
        sb2.append(", frameCount=");
        sb2.append(this.frameCount);
        sb2.append(", duration=");
        return om1.m(sb2, this.duration, ')');
    }
}
