package com.vk.sdk.api.groups.dto;

import com.vk.sdk.api.base.dto.BaseBoolInt;
import com.vk.sdk.api.base.dto.BaseImage;
import io.sentry.protocol.DebugMeta;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ne.b;
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
@Metadata
public final class GroupsCover {

    @b("enabled")
    @NotNull
    private final BaseBoolInt enabled;

    @b(DebugMeta.JsonKeys.IMAGES)
    @Nullable
    private final List<BaseImage> images;

    public GroupsCover(@NotNull BaseBoolInt enabled, @Nullable List<BaseImage> list) {
        Intrinsics.checkNotNullParameter(enabled, "enabled");
        this.enabled = enabled;
        this.images = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupsCover copy$default(GroupsCover groupsCover, BaseBoolInt baseBoolInt, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            baseBoolInt = groupsCover.enabled;
        }
        if ((i & 2) != 0) {
            list = groupsCover.images;
        }
        return groupsCover.copy(baseBoolInt, list);
    }

    @NotNull
    public final BaseBoolInt component1() {
        return this.enabled;
    }

    @Nullable
    public final List<BaseImage> component2() {
        return this.images;
    }

    @NotNull
    public final GroupsCover copy(@NotNull BaseBoolInt enabled, @Nullable List<BaseImage> list) {
        Intrinsics.checkNotNullParameter(enabled, "enabled");
        return new GroupsCover(enabled, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsCover)) {
            return false;
        }
        GroupsCover groupsCover = (GroupsCover) obj;
        return this.enabled == groupsCover.enabled && Intrinsics.a(this.images, groupsCover.images);
    }

    @NotNull
    public final BaseBoolInt getEnabled() {
        return this.enabled;
    }

    @Nullable
    public final List<BaseImage> getImages() {
        return this.images;
    }

    public int hashCode() {
        int iHashCode = this.enabled.hashCode() * 31;
        List<BaseImage> list = this.images;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "GroupsCover(enabled=" + this.enabled + ", images=" + this.images + ")";
    }

    public /* synthetic */ GroupsCover(BaseBoolInt baseBoolInt, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(baseBoolInt, (i & 2) != 0 ? null : list);
    }
}
