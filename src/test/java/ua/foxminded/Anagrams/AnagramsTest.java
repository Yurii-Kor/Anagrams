package ua.foxminded.Anagrams;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnagramsTest {
    private static final String NULL_INPUT_ERROR = "Input string can not be null";
    private static final String EMPTY_STR = "";
    private static final String SPACE = " ";
    private static final String SEVERAL_SPACES = "    ";
    private static final String CHARACTER = "q";
    private static final String SEVERAL_SAME_CHARACTERS = "qq";
    private static final String SEVERAL_SAME_CHARACTERS_UPPER_LOWER_CASE = "qQ";
    private static final String SEVERAL_SAME_CHARACTERS_UPPER_LOWER_CASE_REVERSED = "Qq";
    private static final String SINGLE_WORD = "Word";
    private static final String SINGLE_WORD_REVERSED = "droW";
    private static final String NUMBERS = "1234";
    private static final String SPECIAL_CHARS = "!@#$";
    private static final String SINGLE_WORD_NUMBERS = "1Wo2rd";
    private static final String SINGLE_WORD_NUMBERS_REVERSED = "1dr2oW";
    private static final String SINGLE_WORD_SPECIAL_CHARS = "!Wo@rd";
    private static final String SINGLE_WORD_SPECIAL_CHARS_REVERSED = "!dr@oW";
    private static final String SENTENCE = "Test sentence";
    private static final String SENTENCE_REVERSED = "tseT ecnetnes";
    private static final String SENTENCE_NUMBERS = "  1  Te2st   3sentence4  ";
    private static final String SENTENCE_NUMBERS_REVERSED = "  1  ts2eT   3ecnetnes4  ";
    private static final String SENTENCE_SPECIAL_CHARS = "  !  Te@st   #sentence%  ";
    private static final String SENTENCE_SPECIAL_CHARS_REVERSED = "  !  ts@eT   #ecnetnes%  ";

    private Anagrams anagrams;

    @BeforeEach
    void init() {
        this.anagrams = new Anagrams();
    }

    @Test
    void makeAnagramShouldExpectIllegalArgumentExceptionWhenReceiveNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            anagrams.makeAnagram(null);
        });
        assertEquals(NULL_INPUT_ERROR, exception.getMessage());
    }

    @Test
    void makeAnagramShouldReturnSameStringWhenReceiveEmptyString() {
        assertEquals(EMPTY_STR, anagrams.makeAnagram(EMPTY_STR));
    }

    @Test
    void makeAnagramShouldReturnSameStringWhenReceiveSinglelSpace() {
        assertEquals(SPACE, anagrams.makeAnagram(SPACE));
    }

    @Test
    void makeAnagramShouldReturnSameStringWhenReceiveOnlySeveralSpaces() {
        assertEquals(SEVERAL_SPACES, anagrams.makeAnagram(SEVERAL_SPACES));
    }

    @Test
    void makeAnagramShouldReturnSameStringWhenReceiveSinglelCharacter() {
        assertEquals(CHARACTER, anagrams.makeAnagram(CHARACTER));
    }

    @Test
    void makeAnagramShouldReturnSameStringWhenReceiveSeveralSameCharacters() {
        assertEquals(SEVERAL_SAME_CHARACTERS, anagrams.makeAnagram(SEVERAL_SAME_CHARACTERS));
    }

    @Test
    void makeAnagramShouldReturnReversedOrderOfCharactersWhenReceiveSeveralSameCharactersInUpperAndLowerCase() {
        assertEquals(SEVERAL_SAME_CHARACTERS_UPPER_LOWER_CASE_REVERSED,
                anagrams.makeAnagram(SEVERAL_SAME_CHARACTERS_UPPER_LOWER_CASE));
    }

    @Test
    void makeAnagramShouldReturnReversedLettersOrderOfSingleWordWhenReceiveSingleWord() {
        assertEquals(SINGLE_WORD_REVERSED, anagrams.makeAnagram(SINGLE_WORD));
    }

    @Test
    void makeAnagramShouldReturnSameStringWhenReceiveOnlySeveralNumbers() {
        assertEquals(NUMBERS, anagrams.makeAnagram(NUMBERS));
    }

    @Test
    void makeAnagramShouldReturnSameStringWhenReceiveOnlySeveralSpecialCharacters() {
        assertEquals(SPECIAL_CHARS, anagrams.makeAnagram(SPECIAL_CHARS));
    }

    @Test
    void makeAnagramShouldReturnReversedLettersOrderOfSingleWordWithSameNumbersPositionsWhenReceiveSingleWordWithSeveralNumbers() {
        assertEquals(SINGLE_WORD_NUMBERS_REVERSED, anagrams.makeAnagram(SINGLE_WORD_NUMBERS));
    }

    @Test
    void makeAnagramShouldReturnReversedLettersOrderOfSingleWordWithSameSpecialCharactersPositionsWhenReceiveSingleWordWithSeveralSpecialCharacters() {
        assertEquals(SINGLE_WORD_SPECIAL_CHARS_REVERSED, anagrams.makeAnagram(SINGLE_WORD_SPECIAL_CHARS));
    }

    @Test
    void makeAnagramShouldReturnReversedLettersOrderOfWordsInSentenceWhenReceiveSentence() {
        assertEquals(SENTENCE_REVERSED, anagrams.makeAnagram(SENTENCE));
    }

    @Test
    void makeAnagramShouldReturnReversedLettersOrderOfWordsInSentenceWithSameNumbersPositionsWhenReceiveSentenceWithSeveralNumbers() {
        assertEquals(SENTENCE_NUMBERS_REVERSED, anagrams.makeAnagram(SENTENCE_NUMBERS));
    }

    @Test
    void makeAnagramShouldReturnReversedLettersOrderOfWordsInSentenceWithSameSpecialCharactersPositionsWhenReceiveSentenceWithSeveralSpecialCharacters() {
        assertEquals(SENTENCE_SPECIAL_CHARS_REVERSED, anagrams.makeAnagram(SENTENCE_SPECIAL_CHARS));
    }
}
