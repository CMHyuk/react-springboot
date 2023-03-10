import React, { useState, useEffect } from 'react';

function App() {
    const [exerciseData, setExerciseData] = useState(null);

    useEffect(() => {
        const fetchExerciseData = async () => {
            try {
                const response = await fetch('/exercise/2');
                const data = await response.json();
                setExerciseData(data);

            } catch (error) {
                console.error(error);
            }
        };

        fetchExerciseData();
    }, []);

    console.log(exerciseData);

    return (
        <div>
            {exerciseData ? (
                <div>
                    <h2>{exerciseData.title}</h2>
                    <p>{exerciseData.content}</p>
                </div>
            ) : (
                <p>Loading...</p>
            )}
        </div>
    );
}

export default App;
