package com.vk.sdk.api.wall.dto;

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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class WallWallpostDonut {

    @b("can_publish_free_copy")
    @Nullable
    private final Boolean canPublishFreeCopy;

    @b("edit_mode")
    @Nullable
    private final EditMode editMode;

    @b("is_donut")
    private final boolean isDonut;

    @b("paid_duration")
    @Nullable
    private final Integer paidDuration;

    @b("placeholder")
    @Nullable
    private final WallWallpostDonutPlaceholder placeholder;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum EditMode {
        ALL("all"),
        DURATION("duration");


        @NotNull
        private final String value;

        EditMode(String str) {
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    public WallWallpostDonut(boolean z5, @Nullable Integer num, @Nullable WallWallpostDonutPlaceholder wallWallpostDonutPlaceholder, @Nullable Boolean bool, @Nullable EditMode editMode) {
        this.isDonut = z5;
        this.paidDuration = num;
        this.placeholder = wallWallpostDonutPlaceholder;
        this.canPublishFreeCopy = bool;
        this.editMode = editMode;
    }

    public static /* synthetic */ WallWallpostDonut copy$default(WallWallpostDonut wallWallpostDonut, boolean z5, Integer num, WallWallpostDonutPlaceholder wallWallpostDonutPlaceholder, Boolean bool, EditMode editMode, int i, Object obj) {
        if ((i & 1) != 0) {
            z5 = wallWallpostDonut.isDonut;
        }
        if ((i & 2) != 0) {
            num = wallWallpostDonut.paidDuration;
        }
        if ((i & 4) != 0) {
            wallWallpostDonutPlaceholder = wallWallpostDonut.placeholder;
        }
        if ((i & 8) != 0) {
            bool = wallWallpostDonut.canPublishFreeCopy;
        }
        if ((i & 16) != 0) {
            editMode = wallWallpostDonut.editMode;
        }
        EditMode editMode2 = editMode;
        WallWallpostDonutPlaceholder wallWallpostDonutPlaceholder2 = wallWallpostDonutPlaceholder;
        return wallWallpostDonut.copy(z5, num, wallWallpostDonutPlaceholder2, bool, editMode2);
    }

    public final boolean component1() {
        return this.isDonut;
    }

    @Nullable
    public final Integer component2() {
        return this.paidDuration;
    }

    @Nullable
    public final WallWallpostDonutPlaceholder component3() {
        return this.placeholder;
    }

    @Nullable
    public final Boolean component4() {
        return this.canPublishFreeCopy;
    }

    @Nullable
    public final EditMode component5() {
        return this.editMode;
    }

    @NotNull
    public final WallWallpostDonut copy(boolean z5, @Nullable Integer num, @Nullable WallWallpostDonutPlaceholder wallWallpostDonutPlaceholder, @Nullable Boolean bool, @Nullable EditMode editMode) {
        return new WallWallpostDonut(z5, num, wallWallpostDonutPlaceholder, bool, editMode);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallWallpostDonut)) {
            return false;
        }
        WallWallpostDonut wallWallpostDonut = (WallWallpostDonut) obj;
        return this.isDonut == wallWallpostDonut.isDonut && Intrinsics.a(this.paidDuration, wallWallpostDonut.paidDuration) && Intrinsics.a(this.placeholder, wallWallpostDonut.placeholder) && Intrinsics.a(this.canPublishFreeCopy, wallWallpostDonut.canPublishFreeCopy) && this.editMode == wallWallpostDonut.editMode;
    }

    @Nullable
    public final Boolean getCanPublishFreeCopy() {
        return this.canPublishFreeCopy;
    }

    @Nullable
    public final EditMode getEditMode() {
        return this.editMode;
    }

    @Nullable
    public final Integer getPaidDuration() {
        return this.paidDuration;
    }

    @Nullable
    public final WallWallpostDonutPlaceholder getPlaceholder() {
        return this.placeholder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public int hashCode() {
        boolean z5 = this.isDonut;
        ?? r02 = z5;
        if (z5) {
            r02 = 1;
        }
        int i = r02 * 31;
        Integer num = this.paidDuration;
        int iHashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        WallWallpostDonutPlaceholder wallWallpostDonutPlaceholder = this.placeholder;
        int iHashCode2 = (iHashCode + (wallWallpostDonutPlaceholder == null ? 0 : wallWallpostDonutPlaceholder.hashCode())) * 31;
        Boolean bool = this.canPublishFreeCopy;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        EditMode editMode = this.editMode;
        return iHashCode3 + (editMode != null ? editMode.hashCode() : 0);
    }

    public final boolean isDonut() {
        return this.isDonut;
    }

    @NotNull
    public String toString() {
        return "WallWallpostDonut(isDonut=" + this.isDonut + ", paidDuration=" + this.paidDuration + ", placeholder=" + this.placeholder + ", canPublishFreeCopy=" + this.canPublishFreeCopy + ", editMode=" + this.editMode + ")";
    }

    public /* synthetic */ WallWallpostDonut(boolean z5, Integer num, WallWallpostDonutPlaceholder wallWallpostDonutPlaceholder, Boolean bool, EditMode editMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z5, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : wallWallpostDonutPlaceholder, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : editMode);
    }
}
