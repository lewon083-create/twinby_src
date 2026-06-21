package fh;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateDeserializer;
import io.appmetrica.analytics.impl.A2;
import io.sentry.protocol.ViewHierarchyNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gp implements TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17302a;

    public gp(sy syVar) {
        this.f17302a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final mp deserialize(ParsingContext parsingContext, mp mpVar, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        Field field = mpVar != null ? mpVar.f17886a : null;
        sy syVar = this.f17302a;
        Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, field, syVar.I);
        Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", ip.f17404h, allowPropertyOverride, mpVar != null ? mpVar.f17887b : null, v0.f18733v);
        Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", ip.i, allowPropertyOverride, mpVar != null ? mpVar.f17888c : null, v0.f18734w);
        Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, ViewHierarchyNode.JsonKeys.ALPHA, TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, mpVar != null ? mpVar.f17889d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, ip.f17406k);
        Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, mpVar != null ? mpVar.f17890e : null, syVar.f18544u1);
        Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, A2.f22054g, allowPropertyOverride, mpVar != null ? mpVar.f17891f : null, syVar.G1);
        Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "border", allowPropertyOverride, mpVar != null ? mpVar.f17892g : null, syVar.M1);
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        Field field2 = mpVar != null ? mpVar.f17893h : null;
        Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
        Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper, allowPropertyOverride, field2, function1, ip.f17407l);
        Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, mpVar != null ? mpVar.i : null, syVar.P2);
        Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, mpVar != null ? mpVar.f17894j : null, syVar.f18346b3);
        Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, mpVar != null ? mpVar.f17895k : null, syVar.f18594z3);
        Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, mpVar != null ? mpVar.f17896l : null, syVar.I3);
        Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, mpVar != null ? mpVar.f17897m : null, syVar.U6);
        Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, mpVar != null ? mpVar.f17898n : null);
        Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, mpVar != null ? mpVar.f17899o : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
        Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, mpVar != null ? mpVar.f17900p : null, syVar.K4);
        Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, mpVar != null ? mpVar.f17901q : null, syVar.Y2);
        Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "max_value", typeHelper, allowPropertyOverride, mpVar != null ? mpVar.f17902r : null, function1);
        Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "min_value", typeHelper, allowPropertyOverride, mpVar != null ? mpVar.f17903s : null, function1);
        Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, mpVar != null ? mpVar.f17904t : null, syVar.Y2);
        Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "ranges", allowPropertyOverride, mpVar != null ? mpVar.f17905u : null, syVar.f18405g7);
        Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, mpVar != null ? mpVar.f17906v : null);
        Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper, allowPropertyOverride, mpVar != null ? mpVar.f17907w : null, function1, ip.f17408m);
        Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "secondary_value_accessibility", allowPropertyOverride, mpVar != null ? mpVar.f17908x : null, syVar.I);
        Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, mpVar != null ? mpVar.f17909y : null, syVar.f18453l1);
        Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "thumb_secondary_style", allowPropertyOverride, mpVar != null ? mpVar.f17910z : null, syVar.V2);
        Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "thumb_secondary_text_style", allowPropertyOverride, mpVar != null ? mpVar.A : null, syVar.f18372d7);
        Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "thumb_secondary_value_variable", allowPropertyOverride, mpVar != null ? mpVar.B : null);
        Field field3 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "thumb_style", allowPropertyOverride, mpVar != null ? mpVar.C : null, syVar.V2);
        Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "thumb_text_style", allowPropertyOverride, mpVar != null ? mpVar.D : null, syVar.f18372d7);
        Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "thumb_value_variable", allowPropertyOverride, mpVar != null ? mpVar.E : null);
        Field optionalField15 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "tick_mark_active_style", allowPropertyOverride, mpVar != null ? mpVar.F : null, syVar.V2);
        Field optionalField16 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "tick_mark_inactive_style", allowPropertyOverride, mpVar != null ? mpVar.G : null, syVar.V2);
        Field optionalListField8 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, mpVar != null ? mpVar.H : null, syVar.P8);
        Field field4 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "track_active_style", allowPropertyOverride, mpVar != null ? mpVar.I : null, syVar.V2);
        Field field5 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "track_inactive_style", allowPropertyOverride, mpVar != null ? mpVar.J : null, syVar.V2);
        Field optionalField17 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, mpVar != null ? mpVar.K : null, syVar.S8);
        Field optionalField18 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, mpVar != null ? mpVar.L : null, syVar.V1);
        Field optionalField19 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, mpVar != null ? mpVar.M : null, syVar.A1);
        Field optionalField20 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, mpVar != null ? mpVar.N : null, syVar.A1);
        Field field6 = mpVar != null ? mpVar.O : null;
        kv kvVar = kv.f17646g;
        ep epVar = ip.f17409n;
        Intrinsics.c(epVar, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
        return new mp(optionalField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField, optionalListField2, optionalField2, optionalFieldWithExpression4, optionalListField3, optionalListField4, optionalField3, optionalListField5, optionalField4, optionalField5, optionalFieldWithExpression5, optionalField6, optionalField7, optionalFieldWithExpression6, optionalFieldWithExpression7, optionalField8, optionalListField6, optionalFieldWithExpression8, optionalFieldWithExpression9, optionalField9, optionalListField7, optionalField10, optionalField11, optionalField12, field3, optionalField13, optionalField14, optionalField15, optionalField16, optionalListField8, field4, field5, optionalField17, optionalField18, optionalField19, optionalField20, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field6, kvVar, epVar), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, mpVar != null ? mpVar.P : null, syVar.V8), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, mpVar != null ? mpVar.Q : null, syVar.f18352b9), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, ViewHierarchyNode.JsonKeys.VISIBILITY, ip.f17405j, allowPropertyOverride, mpVar != null ? mpVar.R : null, kv.f17653o), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, mpVar != null ? mpVar.S : null, syVar.f18481n9), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, mpVar != null ? mpVar.T : null, syVar.f18481n9), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, mpVar != null ? mpVar.U : null, syVar.U6));
    }
}
