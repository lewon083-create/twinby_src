package com.vk.sdk.api.events.dto;

import a0.u;
import com.vk.sdk.api.groups.dto.GroupsGroupFullMemberStatus;
import gf.a;
import io.sentry.SentryLockReason;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l7.o;
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
public final class EventsEventAttach {

    @b(SentryLockReason.JsonKeys.ADDRESS)
    @Nullable
    private final String address;

    @b("button_text")
    @NotNull
    private final String buttonText;

    @b("friends")
    @NotNull
    private final List<Integer> friends;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15166id;

    @b("is_favorite")
    private final boolean isFavorite;

    @b("member_status")
    @Nullable
    private final GroupsGroupFullMemberStatus memberStatus;

    @b("text")
    @NotNull
    private final String text;

    @b("time")
    @Nullable
    private final Integer time;

    public EventsEventAttach(@NotNull String buttonText, @NotNull List<Integer> friends, int i, boolean z5, @NotNull String text, @Nullable String str, @Nullable GroupsGroupFullMemberStatus groupsGroupFullMemberStatus, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(friends, "friends");
        Intrinsics.checkNotNullParameter(text, "text");
        this.buttonText = buttonText;
        this.friends = friends;
        this.f15166id = i;
        this.isFavorite = z5;
        this.text = text;
        this.address = str;
        this.memberStatus = groupsGroupFullMemberStatus;
        this.time = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventsEventAttach copy$default(EventsEventAttach eventsEventAttach, String str, List list, int i, boolean z5, String str2, String str3, GroupsGroupFullMemberStatus groupsGroupFullMemberStatus, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = eventsEventAttach.buttonText;
        }
        if ((i10 & 2) != 0) {
            list = eventsEventAttach.friends;
        }
        if ((i10 & 4) != 0) {
            i = eventsEventAttach.f15166id;
        }
        if ((i10 & 8) != 0) {
            z5 = eventsEventAttach.isFavorite;
        }
        if ((i10 & 16) != 0) {
            str2 = eventsEventAttach.text;
        }
        if ((i10 & 32) != 0) {
            str3 = eventsEventAttach.address;
        }
        if ((i10 & 64) != 0) {
            groupsGroupFullMemberStatus = eventsEventAttach.memberStatus;
        }
        if ((i10 & 128) != 0) {
            num = eventsEventAttach.time;
        }
        GroupsGroupFullMemberStatus groupsGroupFullMemberStatus2 = groupsGroupFullMemberStatus;
        Integer num2 = num;
        String str4 = str2;
        String str5 = str3;
        return eventsEventAttach.copy(str, list, i, z5, str4, str5, groupsGroupFullMemberStatus2, num2);
    }

    @NotNull
    public final String component1() {
        return this.buttonText;
    }

    @NotNull
    public final List<Integer> component2() {
        return this.friends;
    }

    public final int component3() {
        return this.f15166id;
    }

    public final boolean component4() {
        return this.isFavorite;
    }

    @NotNull
    public final String component5() {
        return this.text;
    }

    @Nullable
    public final String component6() {
        return this.address;
    }

    @Nullable
    public final GroupsGroupFullMemberStatus component7() {
        return this.memberStatus;
    }

    @Nullable
    public final Integer component8() {
        return this.time;
    }

    @NotNull
    public final EventsEventAttach copy(@NotNull String buttonText, @NotNull List<Integer> friends, int i, boolean z5, @NotNull String text, @Nullable String str, @Nullable GroupsGroupFullMemberStatus groupsGroupFullMemberStatus, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(friends, "friends");
        Intrinsics.checkNotNullParameter(text, "text");
        return new EventsEventAttach(buttonText, friends, i, z5, text, str, groupsGroupFullMemberStatus, num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventsEventAttach)) {
            return false;
        }
        EventsEventAttach eventsEventAttach = (EventsEventAttach) obj;
        return Intrinsics.a(this.buttonText, eventsEventAttach.buttonText) && Intrinsics.a(this.friends, eventsEventAttach.friends) && this.f15166id == eventsEventAttach.f15166id && this.isFavorite == eventsEventAttach.isFavorite && Intrinsics.a(this.text, eventsEventAttach.text) && Intrinsics.a(this.address, eventsEventAttach.address) && this.memberStatus == eventsEventAttach.memberStatus && Intrinsics.a(this.time, eventsEventAttach.time);
    }

    @Nullable
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    public final String getButtonText() {
        return this.buttonText;
    }

    @NotNull
    public final List<Integer> getFriends() {
        return this.friends;
    }

    public final int getId() {
        return this.f15166id;
    }

    @Nullable
    public final GroupsGroupFullMemberStatus getMemberStatus() {
        return this.memberStatus;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final Integer getTime() {
        return this.time;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    public int hashCode() {
        int iG = u.g(this.f15166id, u.i(this.friends, this.buttonText.hashCode() * 31, 31), 31);
        boolean z5 = this.isFavorite;
        ?? r22 = z5;
        if (z5) {
            r22 = 1;
        }
        int iE = a.e((iG + r22) * 31, 31, this.text);
        String str = this.address;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        GroupsGroupFullMemberStatus groupsGroupFullMemberStatus = this.memberStatus;
        int iHashCode2 = (iHashCode + (groupsGroupFullMemberStatus == null ? 0 : groupsGroupFullMemberStatus.hashCode())) * 31;
        Integer num = this.time;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }

    @NotNull
    public String toString() {
        String str = this.buttonText;
        List<Integer> list = this.friends;
        int i = this.f15166id;
        boolean z5 = this.isFavorite;
        String str2 = this.text;
        String str3 = this.address;
        GroupsGroupFullMemberStatus groupsGroupFullMemberStatus = this.memberStatus;
        Integer num = this.time;
        StringBuilder sb2 = new StringBuilder("EventsEventAttach(buttonText=");
        sb2.append(str);
        sb2.append(", friends=");
        sb2.append(list);
        sb2.append(", id=");
        sb2.append(i);
        sb2.append(", isFavorite=");
        sb2.append(z5);
        sb2.append(", text=");
        o.t(sb2, str2, ", address=", str3, ", memberStatus=");
        sb2.append(groupsGroupFullMemberStatus);
        sb2.append(", time=");
        sb2.append(num);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ EventsEventAttach(String str, List list, int i, boolean z5, String str2, String str3, GroupsGroupFullMemberStatus groupsGroupFullMemberStatus, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, i, z5, str2, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : groupsGroupFullMemberStatus, (i10 & 128) != 0 ? null : num);
    }
}
