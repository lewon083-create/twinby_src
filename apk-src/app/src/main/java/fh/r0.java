package fh;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateDeserializer;
import io.sentry.metrics.MetricsUnit;
import io.sentry.protocol.Device;
import io.sentry.protocol.Message;
import io.sentry.rrweb.RRWebVideoEvent;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class r0 implements TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18205a;

    public /* synthetic */ r0(int i) {
        this.f18205a = i;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        switch (this.f18205a) {
            case 0:
                u0 u0Var = (u0) entityTemplate;
                JSONObject jSONObject = (JSONObject) obj;
                boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
                TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
                Field field = u0Var != null ? u0Var.f18666a : null;
                Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
                return new u0(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "bottom", typeHelper, allowPropertyOverride, field, function1, t0.f18606e), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, RRWebVideoEvent.JsonKeys.LEFT, typeHelper, allowPropertyOverride, u0Var != null ? u0Var.f18667b : null, function1, t0.f18607f), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "right", typeHelper, allowPropertyOverride, u0Var != null ? u0Var.f18668c : null, function1, t0.f18608g), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, RRWebVideoEvent.JsonKeys.TOP, typeHelper, allowPropertyOverride, u0Var != null ? u0Var.f18669d : null, function1, t0.f18609h));
            case 1:
                a1 a1Var = (a1) entityTemplate;
                JSONObject jSONObject2 = (JSONObject) obj;
                boolean allowPropertyOverride2 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride2 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                TypeHelper<String> typeHelper2 = TypeHelpersKt.TYPE_HELPER_STRING;
                Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride2, jSONObject2, "description", typeHelper2, allowPropertyOverride2, a1Var != null ? a1Var.f16788a : null);
                Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride2, jSONObject2, "hint", typeHelper2, allowPropertyOverride2, a1Var != null ? a1Var.f16789b : null);
                TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
                Field field2 = a1Var != null ? a1Var.f16790c : null;
                Function1<Object, Boolean> function12 = ParsingConvertersKt.ANY_TO_BOOLEAN;
                return new a1(optionalFieldWithExpression, optionalFieldWithExpression2, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride2, jSONObject2, "is_checked", typeHelper3, allowPropertyOverride2, field2, function12), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride2, jSONObject2, "mode", z0.f19192c, allowPropertyOverride2, a1Var != null ? a1Var.f16791d : null, v0.f18719g), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride2, jSONObject2, "mute_after_action", typeHelper3, allowPropertyOverride2, a1Var != null ? a1Var.f16792e : null, function12), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride2, jSONObject2, "state_description", typeHelper2, allowPropertyOverride2, a1Var != null ? a1Var.f16793f : null), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride2, jSONObject2, "type", allowPropertyOverride2, a1Var != null ? a1Var.f16794g : null, v0.f18720h));
            case 2:
                x4 x4Var = (x4) entityTemplate;
                JSONObject jSONObject3 = (JSONObject) obj;
                boolean allowPropertyOverride3 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride3 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                TypeHelper<String> typeHelper4 = TypeHelpersKt.TYPE_HELPER_STRING;
                return new x4(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride3, jSONObject3, "name", typeHelper4, allowPropertyOverride3, x4Var != null ? x4Var.f18983a : null), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride3, jSONObject3, "value", typeHelper4, allowPropertyOverride3, x4Var != null ? x4Var.f18984b : null));
            case 3:
                q7 q7Var = (q7) entityTemplate;
                return new q7(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), (JSONObject) obj, MetricsUnit.Fraction.RATIO, TypeHelpersKt.TYPE_HELPER_DOUBLE, parsingContext.getAllowPropertyOverride(), q7Var != null ? q7Var.f18149a : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, j6.f17462c));
            case 4:
                ha haVar = (ha) entityTemplate;
                JSONObject jSONObject4 = (JSONObject) obj;
                boolean allowPropertyOverride4 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride4 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
                Field field3 = haVar != null ? haVar.f17330a : null;
                Function1<Number, Long> function13 = ParsingConvertersKt.NUMBER_TO_INT;
                return new ha(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride4, jSONObject4, "bottom-left", typeHelper5, allowPropertyOverride4, field3, function13, j6.f17467h), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride4, jSONObject4, "bottom-right", typeHelper5, allowPropertyOverride4, haVar != null ? haVar.f17331b : null, function13, j6.i), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride4, jSONObject4, "top-left", typeHelper5, allowPropertyOverride4, haVar != null ? haVar.f17332c : null, function13, j6.f17468j), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride4, jSONObject4, "top-right", typeHelper5, allowPropertyOverride4, haVar != null ? haVar.f17333d : null, function13, j6.f17469k));
            case 5:
                kb kbVar = (kb) entityTemplate;
                JSONObject jSONObject5 = (JSONObject) obj;
                boolean allowPropertyOverride5 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride5 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                return new kb(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride5, jSONObject5, "unit", jb.f17487b, allowPropertyOverride5, kbVar != null ? kbVar.f17571a : null, hn.f17349o), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride5, jSONObject5, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride5, kbVar != null ? kbVar.f17572b : null, ParsingConvertersKt.NUMBER_TO_DOUBLE));
            case 6:
                vb vbVar = (vb) entityTemplate;
                JSONObject jSONObject6 = (JSONObject) obj;
                boolean allowPropertyOverride6 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride6 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                TypeHelper<Long> typeHelper6 = TypeHelpersKt.TYPE_HELPER_INT;
                Field field4 = vbVar != null ? vbVar.f18759a : null;
                Function1<Number, Long> function14 = ParsingConvertersKt.NUMBER_TO_INT;
                return new vb(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride6, jSONObject6, "bottom", typeHelper6, allowPropertyOverride6, field4, function14, ub.f18683g), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride6, jSONObject6, "end", typeHelper6, allowPropertyOverride6, vbVar != null ? vbVar.f18760b : null, function14, ub.f18684h), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride6, jSONObject6, RRWebVideoEvent.JsonKeys.LEFT, typeHelper6, allowPropertyOverride6, vbVar != null ? vbVar.f18761c : null, function14, ub.i), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride6, jSONObject6, "right", typeHelper6, allowPropertyOverride6, vbVar != null ? vbVar.f18762d : null, function14, ub.f18685j), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride6, jSONObject6, "start", typeHelper6, allowPropertyOverride6, vbVar != null ? vbVar.f18763e : null, function14, ub.f18686k), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride6, jSONObject6, RRWebVideoEvent.JsonKeys.TOP, typeHelper6, allowPropertyOverride6, vbVar != null ? vbVar.f18764f : null, function14, ub.f18687l), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride6, jSONObject6, "unit", ub.f18682f, allowPropertyOverride6, vbVar != null ? vbVar.f18765g : null, hn.f17349o));
            case 7:
                xb xbVar = (xb) entityTemplate;
                JSONObject jSONObject7 = (JSONObject) obj;
                boolean allowPropertyOverride7 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride7 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                return new xb(JsonFieldParser.readField(parsingContextRestrictPropertyOverride7, jSONObject7, "id", allowPropertyOverride7, xbVar != null ? xbVar.f18997a : null), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride7, jSONObject7, Message.JsonKeys.PARAMS, allowPropertyOverride7, xbVar != null ? xbVar.f18998b : null));
            case 8:
                ad adVar = (ad) entityTemplate;
                JSONObject jSONObject8 = (JSONObject) obj;
                boolean allowPropertyOverride8 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride8 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                TypeHelper<String> typeHelper7 = TypeHelpersKt.TYPE_HELPER_STRING;
                return new ad(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride8, jSONObject8, "key", typeHelper7, allowPropertyOverride8, adVar != null ? adVar.f16827a : null, zc.f19211b), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride8, jSONObject8, "placeholder", typeHelper7, allowPropertyOverride8, adVar != null ? adVar.f16828b : null, zc.f19212c), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride8, jSONObject8, "regex", typeHelper7, allowPropertyOverride8, adVar != null ? adVar.f16829c : null));
            case 9:
                kd kdVar = (kd) entityTemplate;
                JSONObject jSONObject9 = (JSONObject) obj;
                boolean allowPropertyOverride9 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride9 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                TypeHelper<String> typeHelper8 = TypeHelpersKt.TYPE_HELPER_STRING;
                return new kd(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride9, jSONObject9, "down", typeHelper8, allowPropertyOverride9, kdVar != null ? kdVar.f17573a : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride9, jSONObject9, "forward", typeHelper8, allowPropertyOverride9, kdVar != null ? kdVar.f17574b : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride9, jSONObject9, RRWebVideoEvent.JsonKeys.LEFT, typeHelper8, allowPropertyOverride9, kdVar != null ? kdVar.f17575c : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride9, jSONObject9, "right", typeHelper8, allowPropertyOverride9, kdVar != null ? kdVar.f17576d : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride9, jSONObject9, "up", typeHelper8, allowPropertyOverride9, kdVar != null ? kdVar.f17577e : null));
            case 10:
                od odVar = (od) entityTemplate;
                JSONObject jSONObject10 = (JSONObject) obj;
                boolean allowPropertyOverride10 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride10 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                return new od(JsonFieldParser.readField(parsingContextRestrictPropertyOverride10, jSONObject10, "name", allowPropertyOverride10, odVar != null ? odVar.f18032a : null), JsonFieldParser.readField(parsingContextRestrictPropertyOverride10, jSONObject10, "type", allowPropertyOverride10, odVar != null ? odVar.f18033b : null, w9.f18845t));
            case 11:
                xg xgVar = (xg) entityTemplate;
                return new xg(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), (JSONObject) obj, "color", TypeHelpersKt.TYPE_HELPER_COLOR, parsingContext.getAllowPropertyOverride(), xgVar != null ? xgVar.f19023a : null, ParsingConvertersKt.STRING_TO_COLOR_INT));
            case 12:
                ch chVar = (ch) entityTemplate;
                JSONObject jSONObject11 = (JSONObject) obj;
                boolean allowPropertyOverride11 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride11 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                return new ch(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride11, jSONObject11, "allow_empty", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride11, chVar != null ? chVar.f17020a : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride11, jSONObject11, "label_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride11, chVar != null ? chVar.f17021b : null), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride11, jSONObject11, RRWebVideoEvent.REPLAY_FRAME_RATE_TYPE_VARIABLE, allowPropertyOverride11, chVar != null ? chVar.f17022c : null));
            case 13:
                wh whVar = (wh) entityTemplate;
                JSONObject jSONObject12 = (JSONObject) obj;
                boolean allowPropertyOverride12 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride12 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                return new wh(JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride12, jSONObject12, "height_variable_name", allowPropertyOverride12, whVar != null ? whVar.f18890a : null), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride12, jSONObject12, "width_variable_name", allowPropertyOverride12, whVar != null ? whVar.f18891b : null));
            case 14:
                di diVar = (di) entityTemplate;
                JSONObject jSONObject13 = (JSONObject) obj;
                boolean allowPropertyOverride13 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride13 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                return new di(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride13, jSONObject13, "color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride13, diVar != null ? diVar.f17091a : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride13, jSONObject13, "position", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride13, diVar != null ? diVar.f17092b : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, j6.f17472n));
            case 15:
                rk rkVar = (rk) entityTemplate;
                return new rk(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), (JSONObject) obj, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, parsingContext.getAllowPropertyOverride(), rkVar != null ? rkVar.f18248a : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, j6.f17474p));
            case 16:
                sm smVar = (sm) entityTemplate;
                JSONObject jSONObject14 = (JSONObject) obj;
                boolean allowPropertyOverride14 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride14 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                return new sm(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride14, jSONObject14, "color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride14, smVar != null ? smVar.f18319a : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride14, jSONObject14, "position", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride14, smVar != null ? smVar.f18320b : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, j6.f17475q));
            case 17:
                mn mnVar = (mn) entityTemplate;
                JSONObject jSONObject15 = (JSONObject) obj;
                boolean allowPropertyOverride15 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride15 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                TypeHelper<String> typeHelper9 = TypeHelpersKt.TYPE_HELPER_STRING;
                return new mn(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride15, jSONObject15, "text", typeHelper9, allowPropertyOverride15, mnVar != null ? mnVar.f17883a : null), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride15, jSONObject15, "value", typeHelper9, allowPropertyOverride15, mnVar != null ? mnVar.f17884b : null));
            case 18:
                wn wnVar = (wn) entityTemplate;
                JSONObject jSONObject16 = (JSONObject) obj;
                boolean allowPropertyOverride16 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride16 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                return new wn(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride16, jSONObject16, "color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride16, wnVar != null ? wnVar.f18907a : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride16, jSONObject16, Device.JsonKeys.ORIENTATION, rn.f18253c, allowPropertyOverride16, wnVar != null ? wnVar.f18908b : null, hn.f17344j));
            case 19:
                uo uoVar = (uo) entityTemplate;
                JSONObject jSONObject17 = (JSONObject) obj;
                boolean allowPropertyOverride17 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride17 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                return new uo(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride17, jSONObject17, "unit", to.f18658b, allowPropertyOverride17, uoVar != null ? uoVar.f18703a : null, hn.f17349o), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride17, jSONObject17, "value", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride17, uoVar != null ? uoVar.f18704b : null, ParsingConvertersKt.NUMBER_TO_INT, to.f18659c));
            case 20:
                gu guVar = (gu) entityTemplate;
                JSONObject jSONObject18 = (JSONObject) obj;
                boolean allowPropertyOverride18 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride18 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                return new gu(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride18, jSONObject18, "description", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride18, guVar != null ? guVar.f17309a : null), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride18, jSONObject18, "type", allowPropertyOverride18, guVar != null ? guVar.f17310b : null, kr.f17617l));
            case 21:
                ot otVar = (ot) entityTemplate;
                return new ot(JsonFieldParser.readOptionalFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), (JSONObject) obj, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, parsingContext.getAllowPropertyOverride(), otVar != null ? otVar.f18068a : null, ParsingConvertersKt.ANY_TO_BOOLEAN));
            default:
                uw uwVar = (uw) entityTemplate;
                JSONObject jSONObject19 = (JSONObject) obj;
                boolean allowPropertyOverride19 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride19 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                TypeHelper<Long> typeHelper10 = TypeHelpersKt.TYPE_HELPER_INT;
                Field field5 = uwVar != null ? uwVar.f18717a : null;
                Function1<Number, Long> function15 = ParsingConvertersKt.NUMBER_TO_INT;
                return new uw(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride19, jSONObject19, "height", typeHelper10, allowPropertyOverride19, field5, function15, j6.f17477s), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride19, jSONObject19, "width", typeHelper10, allowPropertyOverride19, uwVar != null ? uwVar.f18718b : null, function15, j6.f17478t));
        }
    }
}
